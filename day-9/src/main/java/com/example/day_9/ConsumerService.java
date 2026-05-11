package com.example.day_9;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ConsumerService {
    //karta göre işlem tarihi listesi
    // Sadece bu satırı değiştirmen yeterli:
    private final Map<String, List<Long>> kartGecmisi = new ConcurrentHashMap<>();
    @KafkaListener(topics = "kart_topic" , groupId = "group1")

    public void listen(KartDto kartDto) {
        String kartno=kartDto.getKartNo();
        Long suanki= kartDto.getTimestamp();
        BigDecimal limitpara=kartDto.getPara();

        List<Long> islemler = kartGecmisi.computeIfAbsent(kartno, k -> Collections.synchronizedList(new ArrayList<>()));
        // 2. TEMİZLİK: Şu anki zamandan 10 saniye (10000 ms) öncesinden eski olanları sil
        islemler.removeIf(vakit -> (suanki - vakit) > 10000);
        islemler.add(suanki);

        boolean hizihlali=islemler.size()>3;

        boolean yuksekislem = limitpara.compareTo(new BigDecimal("50000")) >= 0;

 if(yuksekislem||hizihlali){

      if(hizihlali&&yuksekislem){
          System.out.println("DOLANDIRICILIK ŞÜPHESİ");
          System.out.println("Kartno: "+ kartno);
          System.out.println("kart sahibinin adı :" + kartDto.getKartsahibiAdi());
      }
     else if(hizihlali){
          System.out.println("10 sn çok fazla girmeye çalıştı");
          System.out.println("Kartno: "+ kartno);
      }
      else if(yuksekislem){
          System.out.println("yüksek miktarda para gönderildi");
          System.out.println("Kartno: "+ kartno);
      }
    }
        else{
            System.out.println("işlem onaylandı");
        }

    }
}


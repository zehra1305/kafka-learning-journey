package com.example.day_6;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ConsumerServise {
    @KafkaListener(topics = "siparis",groupId = "group_1")

    public void listen(SiparisDto siparisDto) {
        System.out.println("YENİ SİPARİŞ ALINDI " + siparisDto.getUrunAdi());

        if (siparisDto.getFiyat().compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("sipariş fiyatı 0 dan küçük olamaz hatalı gönderim " + siparisDto.getFiyat());
        }
       if(!siparisDto.isGonderildimi()){
           throw new RuntimeException("gönderilmemiş ürün işlenemez");
       }
        System.out.println("SİPARİŞ BAŞARIYLA ALINDI " + siparisDto.getMusteriAdi());
    }
}

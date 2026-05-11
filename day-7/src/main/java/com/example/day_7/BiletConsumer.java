package com.example.day_7;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@Service
public class BiletConsumer {
    private final Map<String, String> biletKayitDefteri = new HashMap<>();
    @KafkaListener(topics = "bilet_topic",groupId = "group1")

    public void listen( BiletDto biletDto) {
        String biletNo = biletDto.getBiletno();
        String suankiKapi=biletDto.getKapi();

        if(biletDto.getBiletno().endsWith("40")){
            biletDto.setisVip(true);
            System.out.println("vip müşteri" + biletDto.getAd());
        }

        if(biletKayitDefteri.containsKey(biletNo)) {
            String oncekiKapi = biletKayitDefteri.get(biletNo);

            if (!oncekiKapi.equals(suankiKapi)) {
                System.err.println("Bilet No: " + biletNo + " zaten " + oncekiKapi + " kapısından girdi.");
                System.err.println("Şu an girmeye çalışılan yer: " + suankiKapi);
            }

        }
        else{
            biletKayitDefteri.put(biletNo, suankiKapi);
            System.out.println("bir hata oldu bir daha girmeye çalışıyor");
        }
    }
}

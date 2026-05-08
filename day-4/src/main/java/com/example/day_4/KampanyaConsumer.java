package com.example.day_4;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KampanyaConsumer {
    @KafkaListener(topics = "yemektopic",groupId = "kampanya-group")
    public void listenerKampanya(SiparisDto siparisDto){
        double kampanya=0.10*(siparisDto.getPara());
        System.out.println(siparisDto.getYemekAdi()   +  "siparişinden "  +  kampanya  +  "kazanıldı");
    }
}

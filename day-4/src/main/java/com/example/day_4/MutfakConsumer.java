package com.example.day_4;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MutfakConsumer {
    @KafkaListener(topics = "yemektopic", groupId = "mutfak_grubu")

    public void mutfakListener(SiparisDto siparisDto){
        System.out.println(siparisDto.getYemekAdi());
    }
}

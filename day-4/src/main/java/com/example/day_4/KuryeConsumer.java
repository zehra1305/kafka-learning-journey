package com.example.day_4;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KuryeConsumer {
    @KafkaListener(topics = "yemektopic",groupId = "kurye-gruop")

    public void listenerKurye(SiparisDto siparisDto){
        System.out.println(siparisDto.getmusteriAdresi());
    }
}

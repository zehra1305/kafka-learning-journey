package com.example.day_6;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class ProducerServise {
    KafkaTemplate<String, SiparisDto> kafkaTemplate;

    public ProducerServise(KafkaTemplate<String, SiparisDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendSiparis(SiparisDto siparisDto) {
        kafkaTemplate.send("siparis", siparisDto);
    }
}

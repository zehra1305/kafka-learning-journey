package com.example.day_7;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class BiletProducer {
    KafkaTemplate<String, BiletDto> kafkaTemplate;

    public BiletProducer(KafkaTemplate<String, BiletDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(BiletDto biletDto) {
        kafkaTemplate.send("bilet_topic",biletDto);
    }
}

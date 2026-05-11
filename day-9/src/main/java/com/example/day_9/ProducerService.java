package com.example.day_9;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    KafkaTemplate<String ,KartDto> kafkaTemplate;

    public ProducerService(KafkaTemplate<String ,KartDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void send(KartDto kartDto) {
        kartDto.setTimestamp(System.currentTimeMillis());
         kafkaTemplate.send("kart_topic", kartDto);
    }

}

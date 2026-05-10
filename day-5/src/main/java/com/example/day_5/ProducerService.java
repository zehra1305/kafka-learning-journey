package com.example.day_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    @Autowired
    KafkaTemplate<String, MusteriDto> kafkaTemplate;

    public void send (MusteriDto musteriDto) {
        kafkaTemplate.send("tumIslemler", musteriDto);
    }
}

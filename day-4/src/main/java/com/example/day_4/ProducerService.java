package com.example.day_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    @Autowired
    KafkaTemplate<String, SiparisDto> kafkaTemplate;

    public void send(SiparisDto siparisDto){
        kafkaTemplate.send("yemektopic",siparisDto);
    }
}

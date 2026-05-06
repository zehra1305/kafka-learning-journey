package com.example.kafka_cal.sma;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "${acil_topic}", groupId = "kafka_cal-sma")
    public void emergency (String message) {
        System.out.println("acil hat "+ message);
    }
    @KafkaListener(topics = "${genel_topic}", groupId = "kafka_cal-sma")
     public void genel (String message) {
        System.out.println("genel hat" + message);
    }
}

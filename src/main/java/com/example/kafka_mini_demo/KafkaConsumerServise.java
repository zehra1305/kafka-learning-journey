package com.example.kafka_mini_demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServise {
    /// mesajları alan sınıf
    @KafkaListener(topics = "topic",groupId = "mini-banka-grubu")

    public void ListenMessage (String message){
        System.out.println(message);
    }
}

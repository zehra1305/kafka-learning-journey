package com.example.kafka_mini_demo;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerServise {
    KafkaTemplate<String,String> kafkaTemplate;
   /// mesaj göndermek için kafkatemplate muhtacız o yüzden yapıcı metota bunu gönderdik
    public KafkaProducerServise( KafkaTemplate<String,String> kafkaTemplate) {
        this.kafkaTemplate=kafkaTemplate;
    }

    public void SendMessage(String message){
        kafkaTemplate.send("topic",message);
        System.out.println("Sent message: "+message);///mesaj gitti mi ?
    }
}

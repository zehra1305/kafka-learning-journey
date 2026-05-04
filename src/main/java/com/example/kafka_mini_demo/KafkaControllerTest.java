package com.example.kafka_mini_demo;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class KafkaControllerTest {
    private KafkaProducerServise kafkaProducer;

    public KafkaControllerTest(KafkaProducerServise kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/send")
    public String sendMessage(@RequestParam("m") String message){
     kafkaProducer.SendMessage(message);
     return "success";
    }
}

package com.example.kafka_cal.sma;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
@CrossOrigin(origins = "*")
public class controller {
    KafkaProducerr kafkaProducerr;
    @Autowired
    public controller (KafkaProducerr kafkaProducerr) {
        this.kafkaProducerr = kafkaProducerr;
    }
    @GetMapping("/send")
    public  void send (@RequestParam("message") String message){
        kafkaProducerr.send(message);
    }


}

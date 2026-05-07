package com.example.day_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServise {
    @Autowired
    KafkaTemplate< String,TransferDto> kafkaTemplate;

   public void send(TransferDto transferDto) {
       kafkaTemplate.send("topic",transferDto);
   }
}

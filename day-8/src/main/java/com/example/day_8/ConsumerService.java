package com.example.day_8;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
   @KafkaListener(topics = "topicStudent",groupId = "group1")

    public void listen(StudentDto studentDto) {
       System.out.println(studentDto.getAdi());
       System.out.println(studentDto.getSoyadi());
       System.out.println(studentDto.getOgrenciNumarasi());
       System.out.println(studentDto.getSinifi());
   }
}

package com.example.day_8;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    KafkaTemplate<String, StudentDto> kafkaTemplate;

    public ProducerService(KafkaTemplate<String, StudentDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(StudentDto studentDto) {
        kafkaTemplate.send("topicStudent", studentDto);
    }
}

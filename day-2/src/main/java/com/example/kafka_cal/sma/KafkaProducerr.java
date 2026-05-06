package com.example.kafka_cal.sma;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerr {
    @Value("${acil_topic}")
    private String acil_topic;
    @Value("${genel_topic}")
    private String genel_topic;
    KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerr(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void send (String message) {
      if (message.startsWith("ACIL:")){
          kafkaTemplate.send(acil_topic,message);
        }
      else {
          kafkaTemplate.send(genel_topic,message);
      }
    }

}

package com.example.day_3;



import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServise {
    @KafkaListener(topics = "topic", groupId = "bank-group")
    public void listen(TransferDto transferDto) {
        System.out.println("gönderen: " + transferDto.getGönderen());
        System.out.println("miktar:" + transferDto.getPara());
    }

}

package com.example.day_5;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
@KafkaListener(topics = "riskliIslemler",groupId ="bank" )
    public void listen ( MusteriDto musteri) {
    System.out.println("riskli islemler!!");
    System.out.println(musteri.getMusteriAdi());
    System.out.println(musteri.getPara());
}
    // ConsumerService.java içinde
    @KafkaListener(topics="tumIslemler", groupId = "güven-bank") // Burayı değiştirdik
    public void listenGenel(MusteriDto musteriDto) {
        System.out.println("Normal İşlem: " + musteriDto.getMusteriAdi());
        System.out.println("güvenli işlemler");
    }

}

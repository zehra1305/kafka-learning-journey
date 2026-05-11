package com.example.day_7;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RequestMapping("/api/bilet")
@RestController
public class BiletController {
    BiletProducer biletProducer;
    public BiletController(BiletProducer biletProducer) {
        this.biletProducer = biletProducer;
    }

    @PostMapping("/okut")
    public void send(@RequestBody BiletDto biletDto) {
        System.out.println(">>> KAFKA'DAN MESAJ GELDİ: " + biletDto.getAd());
        biletProducer.send(biletDto);
    }
}

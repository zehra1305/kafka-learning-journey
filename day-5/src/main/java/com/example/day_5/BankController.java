package com.example.day_5;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
public class BankController {
    ProducerService producerService;
    public BankController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/islem")
    public void post(@RequestBody MusteriDto musteriDto) {
        producerService.send(musteriDto);
    }
}

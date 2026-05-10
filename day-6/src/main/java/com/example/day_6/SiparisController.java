package com.example.day_6;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
public class SiparisController {
    ProducerServise producerServise;

    public SiparisController(ProducerServise producerServise) {
        this.producerServise = producerServise;
    }

    @PostMapping("/gonder")
    public void send(@RequestBody SiparisDto siparisDto) {
        producerServise.sendSiparis(siparisDto);
    }
}

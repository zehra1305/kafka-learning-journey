package com.example.day_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SiparisController {
    @Autowired
    ProducerService producerService;

    @PostMapping("/siparis-ver")
    public void send(@RequestBody SiparisDto siparisDto){
       int sayı= new Random().nextInt(10000);
      siparisDto.setSiparisId(sayı);
       producerService.send(siparisDto);
    }

}

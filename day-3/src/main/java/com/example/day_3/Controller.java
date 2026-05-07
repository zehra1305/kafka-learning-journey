package com.example.day_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class Controller {
    @Autowired
    ProducerServise producerServise;
    /// sadece void yada stringte gönderebilirdik ama bu şekilde daha profesyonel.
    @PostMapping("/transfer")
    public ResponseEntity<String> send(@RequestBody TransferDto transferDto) {
        producerServise.send(transferDto);
        return ResponseEntity.ok("İşlem Başarılı");
    }
}

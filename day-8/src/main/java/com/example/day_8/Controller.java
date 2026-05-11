package com.example.day_8;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class Controller {
    ProducerService producerService;
    public Controller(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/send")
    public void send(@RequestBody StudentDto studentDto) {
        producerService.send(studentDto);
    }
}

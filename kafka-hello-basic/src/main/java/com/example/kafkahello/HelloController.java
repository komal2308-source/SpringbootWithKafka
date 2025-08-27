package com.example.kafkahello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloProducer producer;

    public HelloController(HelloProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/send/{message}")
    public String sendMessage(@PathVariable("message") String message) {
        producer.sendMessage(message);
        return "✅ Message sent: " + message;
    }
}

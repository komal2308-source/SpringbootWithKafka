package com.example.kafkahello;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HelloConsumer {
    @KafkaListener(topics = "${app.kafka.topic}", groupId = "hello-group")
    public void listen(String message) {
        System.out.println("📩 Received: " + message);
    }
}

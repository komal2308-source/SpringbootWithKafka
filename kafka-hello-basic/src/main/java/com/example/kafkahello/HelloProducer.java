package com.example.kafkahello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String topic;

    public HelloProducer(KafkaTemplate<String, String> kafkaTemplate,
                         @Value("${app.kafka.topic}") String topic) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    public void sendMessage(String msg) {
        kafkaTemplate.send(topic, msg);
        System.out.println("✅ Sent: " + msg);
    }
}

package org.example.service;

import org.example.dto.MessageDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "json-topic", groupId = "json-group")
    public void listen(MessageDTO message) {
        System.out.println("Received message: " + message);
    }
}
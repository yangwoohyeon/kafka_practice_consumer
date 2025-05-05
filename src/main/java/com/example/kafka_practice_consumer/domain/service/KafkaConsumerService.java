package com.example.kafka_practice_consumer.domain.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "my-topic", groupId = "consumer_group01")
    public void consume(String message) {
        log.info("Consumed Message : {}", message);
    }
}

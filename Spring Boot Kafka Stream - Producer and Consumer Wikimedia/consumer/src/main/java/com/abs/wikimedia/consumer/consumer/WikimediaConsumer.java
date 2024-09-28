package com.abs.wikimedia.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia-stream-topic", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info(String.format("Consuming the message from wikimedia-stream-topic Topic :: %s", message));

        //  Data processing logic, Database operations, Further API calls go from here.
    }
}
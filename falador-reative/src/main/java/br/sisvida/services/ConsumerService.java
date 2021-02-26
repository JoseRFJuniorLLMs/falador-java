package br.sisvida.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

@Service
public class ConsumerService {

    private final Logger logger = LoggerFactory.getLogger(ConsumerService.class);
    private static final String TOPIC = "users";

    @Autowired
    public KafkaTemplate<String, String> kafkaTemplate;

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consomeMessage(String message) throws IOException {
        logger.info(String.format(message));
        this.kafkaTemplate.send(TOPIC, message);
    }
}
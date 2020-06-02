package com.matheesha.alertrabbitproducer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.matheesha.alertrabbitproducer.entity.Alert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class AlertPrimer implements CommandLineRunner {
    @Value("${amqp.queue.name}")
    private String queueName;

    @Value("${data.url}")
    private String url;

    private static final Logger LOGGER = LoggerFactory.getLogger(AlertPrimer.class);

    private RestTemplate restTemplate;
    private final RabbitTemplate rabbitTemplate;
    private final ConfigurableApplicationContext context;
    private final ObjectMapper objectMapper;

    @Autowired
    public AlertPrimer(RabbitTemplate rabbitTemplate, ConfigurableApplicationContext context, ObjectMapper objectMapper) {
        super();
        this.restTemplate = new RestTemplate();
        this.rabbitTemplate = rabbitTemplate;
        this.context = context;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... strings) {
        Object[] dataArray = this.restTemplate.getForObject(url, Object[].class);
        List<Object> allData = Arrays.asList(dataArray);

        allData.forEach(data -> {
            LOGGER.info("Sending Message: {}", data.toString());
            try {
                String jsonString = objectMapper.writeValueAsString(data);
                rabbitTemplate.convertAndSend(queueName, jsonString);
            } catch (JsonProcessingException e) {
                LOGGER.error("Parsing Exception", e);
            }
        });
        System.exit(SpringApplication.exit(context));
    }

}

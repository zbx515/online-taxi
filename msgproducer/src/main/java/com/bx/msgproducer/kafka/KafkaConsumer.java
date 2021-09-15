package com.bx.msgproducer.kafka;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {

    @KafkaListener(topics = {"topic-demo"})
    public void consumer(String message){
        System.out.println("message: "+message);
    }
}

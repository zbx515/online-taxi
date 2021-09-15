package com.bx.msgproducer.kafka;

import com.bx.msgproducer.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class KafkaProducerTemplate {

    @Autowired
    private MyConfig myConfig;

    @Scheduled(fixedRate = 1000*10)
    public void testkafka(){
        myConfig.send();
    }
}

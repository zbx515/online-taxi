package com.bx.msgproducer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Component
public class MyConfig {
    @Autowired
    public KafkaTemplate<String,String> kafkaTemplate;

    public void send(){
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("topic-demo", "hello-kafka");
        future.addCallback(new ListenableFutureCallback(){

            @Override
            public void onSuccess(Object result) {
                System.out.println("成功："+result);
            }

            @Override
            public void onFailure(Throwable ex) {
                System.out.println(ex);
            }
        });
    }
}

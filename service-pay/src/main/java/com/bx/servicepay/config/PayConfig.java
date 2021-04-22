package com.bx.servicepay.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.RedeliveryPolicy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJcaListenerContainerFactory;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.listener.endpoint.JmsMessageEndpointFactory;

@Configuration
public class PayConfig {

    @Value("${spring.activemq.broker-url}")
    private String brokerUrl;

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory(RedeliveryPolicy redeliveryPolicy){
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(brokerUrl);
        activeMQConnectionFactory.setRedeliveryPolicy(redeliveryPolicy);
        return activeMQConnectionFactory;
    }

    /**
     * 重发配置
     * @return
     */
    @Bean
    public RedeliveryPolicy redeliveryPolicy(){
        RedeliveryPolicy redeliveryPolicy = new RedeliveryPolicy();
        return redeliveryPolicy;
    }

    @Bean
    public JmsListenerContainerFactory jmsListenerContainerFactory(ActiveMQConnectionFactory activeMQConnectionFactory){
        DefaultJmsListenerContainerFactory listenerContainerFactory = new DefaultJmsListenerContainerFactory();
        listenerContainerFactory.setConnectionFactory(activeMQConnectionFactory);
        //1、自动确认  2、客户端手动确认  3、自动批量确认  4、事务提交并确认
        listenerContainerFactory.setSessionAcknowledgeMode(2);
        return listenerContainerFactory;
    }

}

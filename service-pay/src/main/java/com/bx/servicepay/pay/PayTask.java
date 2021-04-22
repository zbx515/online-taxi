package com.bx.servicepay.pay;

import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

@Component
public class PayTask {

    @JmsListener(destination="mq",containerFactory = "jmsListenerContainerFactory")
    public void receive(TextMessage textMessage, Session session) throws JMSException {
        try {
            System.out.println("收到消息: "+textMessage.getText());
            int i= 1/0;
            //执行插入操作，完成后返回ACK
            textMessage.acknowledge();

        }catch (Exception e){
            //如果异常重新消费  默认消费6次  如果都失败 进入死信队列
            System.out.println("异常了...");
            session.recover();
        }

    }

    /**
     * 先记录下来 做补偿处理   人工、手动等
     * @param text
     */
    @JmsListener(destination="DLQ.mq",containerFactory = "jmsListenerContainerFactory")
    public void dlqueue(String text){
        System.out.println("死信队列："+text);
    }

}

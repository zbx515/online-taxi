package com.bx.zkdubborocketmq.utils;

import org.apache.rocketmq.client.producer.*;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.common.message.MessageQueue;

public class RocketMqTest {
    public static void main(String[] args)throws Exception {
        tranactionMsg();
    }




    public static void tranactionMsg()throws Exception{
        TransactionMQProducer mqProducer = new TransactionMQProducer("ooxx");
        mqProducer.setNamesrvAddr("localhost:9876");
        mqProducer.start();
        Message message = new Message("tetsTopic","我是事务消息".getBytes());
        mqProducer.setTransactionListener(new TransactionListener() {
            @Override
            public LocalTransactionState executeLocalTransaction(Message message, Object o) {
                System.out.println("执行本地事务...");
                System.out.println("TransactionId: "+message.getTransactionId());
                return LocalTransactionState.UNKNOW;
            }

            @Override
            public LocalTransactionState checkLocalTransaction(MessageExt messageExt) {
                String transactionId = messageExt.getTransactionId();
                System.out.println("transactionId: "+transactionId);
                System.out.println("检查本地事务...");
                return LocalTransactionState.UNKNOW;
            }
        });
        mqProducer.sendMessageInTransaction(message,null);
    }


    public static void sendMsg()throws Exception{
        DefaultMQProducer producer = new DefaultMQProducer("ooxx");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        Message message = new Message("tetsTopic","hahaah".getBytes());
        SendResult result = producer.send(message);
        MessageQueue messageQueue = result.getMessageQueue();
        String brokerName = messageQueue.getBrokerName();
        System.out.println("brokerName: "+brokerName);
        System.out.println(result.getMsgId());
        producer.shutdown();
    }
}

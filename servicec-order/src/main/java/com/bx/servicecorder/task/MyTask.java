package com.bx.servicecorder.task;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bx.servicecorder.dao.OrderEventDao;
import com.bx.servicecorder.entity.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.jms.Queue;
import java.util.List;

@Component
public class MyTask {

    @Autowired
    private OrderEventDao orderEventDao;

    @Autowired
    private Queue queue;

    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;

    @Scheduled(cron = "0/5 * * * * ?")
    @Transactional(rollbackFor = Exception.class)
    public void task(){
        System.out.println("我是定时任务...");
        List<OrderEvent> orderEvents = orderEventDao.selectByOrderType(0);
        for (int i = 0; i <orderEvents.size() ; i++) {
            OrderEvent orderEvent = orderEvents.get(i);
            //修改数据状态
            orderEventDao.updateById(orderEvent.getId());
            System.out.println("修改完成");
            //将消息写入队列
            jmsMessagingTemplate.convertAndSend(queue, JSON.toJSONString(orderEvent));

        }
    }
}

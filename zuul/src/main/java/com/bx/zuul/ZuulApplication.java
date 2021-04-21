package com.bx.zuul;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.bx.zuul.yml.MyYml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args) {
        init();
        SpringApplication.run(ZuulApplication.class, args);
    }

    /**
     * 使用阿里巴巴的 sentinel做限流
     */
    private static void init(){
        List<FlowRule> list = new ArrayList<>();
        FlowRule flowRule = new FlowRule();
        flowRule.setRefResource("hello");
        flowRule.setCount(1);
        //限流类型
        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        list.add(flowRule);
        FlowRuleManager.loadRules(list);
    }
}

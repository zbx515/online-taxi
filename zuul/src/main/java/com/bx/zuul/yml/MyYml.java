package com.bx.zuul.yml;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

/**
 * 加载自定义YML文件    可以配置自定义的数据
 */
@PropertySource(value = {"classpath:application-my.yml"})
@Data
@Component
@ConfigurationProperties(prefix = "zbx")
public class MyYml {

    @Value("${data}")
    private String data;

}

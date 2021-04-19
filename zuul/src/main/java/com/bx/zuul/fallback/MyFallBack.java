package com.bx.zuul.fallback;

import com.alibaba.druid.support.json.JSONUtils;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/**
 * 统一异常处理
 */
@Component
public class MyFallBack implements FallbackProvider {
    @Override
    public String getRoute() {
        //此处写*  对所有服务生效
        return "*";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        ClientHttpResponse httpResponse = new ClientHttpResponse() {
            @Override
            public HttpHeaders getHeaders() {
                return null;
            }

            @Override
            public InputStream getBody() throws IOException {
                HashMap map = new HashMap();
                map.put("code","-1");
                map.put("message","矮油，网络出小差了");
                return new ByteArrayInputStream(JSONUtils.toJSONString(map).getBytes());
            }

            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.BAD_REQUEST;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return 0;
            }

            @Override
            public String getStatusText() throws IOException {
                return "message";
            }

            @Override
            public void close() {

            }
        };
        return httpResponse;
    }
}

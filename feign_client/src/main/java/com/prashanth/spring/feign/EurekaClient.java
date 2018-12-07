package com.prashanth.spring.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("a-eureka-client")
public interface EurekaClient {

    @RequestMapping("/message")
    String getMessage();
}

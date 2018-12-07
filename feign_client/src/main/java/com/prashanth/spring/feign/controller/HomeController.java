package com.prashanth.spring.feign.controller;

import com.prashanth.spring.feign.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    EurekaClient eurekaClient;

    @RequestMapping("/get-message")
    public String getMessage() {
        return eurekaClient.getMessage();
    }
}

package com.in28minutes.microservices.limits_service.controller;

import com.in28minutes.microservices.limits_service.bean.Limit;
import com.in28minutes.microservices.limits_service.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limit retrieveLimits(){
        return new Limit(configuration.getMinimum(),configuration.getMaximum());
        //return new Limit(1, 1000);
    }
}

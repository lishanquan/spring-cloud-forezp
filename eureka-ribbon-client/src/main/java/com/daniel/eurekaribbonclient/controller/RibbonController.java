package com.daniel.eurekaribbonclient.controller;

import com.daniel.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Daniel
 * @Date: 2019/7/22 17:04
 */
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("hi")
    public String hi(@RequestParam(required = false, defaultValue = "daniel") String name){
        return ribbonService.hi(name);
    }

    @Autowired
    private LoadBalancerClient loadBalancer;

    @GetMapping("testRibbon")
    public String testRibbon(){
        ServiceInstance instance = loadBalancer.choose("eureka-client");
        return instance.getHost() + ":" + instance.getPort();
    }

}

package com.daniel.ribbonclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Daniel
 * @Date: 2019/7/22 17:43
 */
@RestController
public class RibbonController {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @RequestMapping("testRibbon")
    public String testRibbon(){
        ServiceInstance instance = loadBalancer.choose("stores");
        return instance.getHost() + ":" + instance.getPort();
    }

}

package com.daniel.eurekaclientone2.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Daniel
 * @Date: 2019/7/26 10:23
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping("hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String home(@RequestParam String name){
        return "hi " + name + ", i am yiyi from port:" + port;
    }

    public String hiError(String name){
        return "hi, " + name + ", sorry, error!";
    }

}

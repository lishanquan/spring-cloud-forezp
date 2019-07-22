package com.daniel.eurekaribbonclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Daniel
 * @Date: 2019/7/22 17:02
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String hi(String name){
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
    }

}

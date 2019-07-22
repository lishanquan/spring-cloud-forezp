package com.daniel.eurekafeignclient.service;

import com.daniel.eurekafeignclient.feign.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Daniel
 * @Date: 2019/7/22 19:52
 */
@Service
public class HiService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name){
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }

}

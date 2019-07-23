package com.daniel.eurekafeignclient.hystrix;

import com.daniel.eurekafeignclient.feign.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @Author: Daniel
 * @Date: 2019/7/23 11:04
 */
@Component
public class HiHystrix implements EurekaClientFeign {

    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi, " + name + ", sorry, error!";
    }

}

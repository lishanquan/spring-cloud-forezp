package com.daniel.eurekafeignclient.feign;

import com.daniel.eurekafeignclient.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Daniel
 * @Date: 2019/7/22 19:46
 */
@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaClientFeign {

    @GetMapping(value = "/hi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);

}

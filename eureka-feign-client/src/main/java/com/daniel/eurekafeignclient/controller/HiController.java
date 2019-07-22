package com.daniel.eurekafeignclient.controller;

import com.daniel.eurekafeignclient.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Daniel
 * @Date: 2019/7/22 19:54
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @GetMapping("hi")
    public String sayHi(@RequestParam(defaultValue = "daniel", required = false) String name){
        return hiService.sayHi(name);
    }

}

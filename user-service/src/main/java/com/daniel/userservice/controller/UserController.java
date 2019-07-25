package com.daniel.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Daniel
 * @Date: 2019/7/25 11:41
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("hi")
    public String hi(){
        return "I'm daniel.";
    }

}

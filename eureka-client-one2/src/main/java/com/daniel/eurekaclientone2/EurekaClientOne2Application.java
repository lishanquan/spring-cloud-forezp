package com.daniel.eurekaclientone2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientOne2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientOne2Application.class, args);
    }

}

package com.daniel.adminserver2;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication
public class AdminServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(AdminServer2Application.class, args);
    }

}

package com.daniel.adminturbineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class AdminTurbineServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminTurbineServiceApplication.class, args);
    }

}

package com.daniel.adminserver2;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableHystrixDashboard
@EnableHystrix
@EnableTurbine
@EnableAdminServer
@SpringBootApplication
public class AdminServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(AdminServer2Application.class, args);
    }

}

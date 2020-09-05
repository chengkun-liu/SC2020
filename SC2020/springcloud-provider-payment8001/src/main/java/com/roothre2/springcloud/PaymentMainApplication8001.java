package com.roothre2.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Roothre2
 * @create 2020-09-02  21:23:00
 */
@SpringBootApplication
@EnableEurekaServer
public class PaymentMainApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainApplication8001.class,args);
    }
}

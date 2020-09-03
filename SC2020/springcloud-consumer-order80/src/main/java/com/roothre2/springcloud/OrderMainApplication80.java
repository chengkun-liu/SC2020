package com.roothre2.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Roothre2
 * @create 2020-09-02  22:52:00
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMainApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainApplication80.class,args);
    }
}

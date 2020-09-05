package com.roothre2.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author Roothre2
 * @create 2020-09-03  21:56:00
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMainApplication7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMainApplication7002.class, args);
    }
}

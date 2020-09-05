package com.roothre2.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.swing.*;

/**
 * @author Roothre2
 * @create 2020-09-05  07:47:00
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulMain80.class,args);
    }
}

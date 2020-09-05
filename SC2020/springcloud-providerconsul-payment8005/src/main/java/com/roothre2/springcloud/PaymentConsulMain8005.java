package com.roothre2.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.swing.*;

/**
 * @author Roothre2
 * @create 2020-09-05  07:41:00
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsulMain8005 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulMain8005.class,args);
    }
}

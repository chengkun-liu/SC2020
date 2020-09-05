package com.roothre2.springcloud;

import com.netflix.loadbalancer.IRule;
import com.roothre2.myrule.MySefRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

import javax.naming.Name;

/**
 * @author Roothre2
 * @create 2020-09-02  22:52:00
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="springcloud-payment-service",configuration = MySefRule.class)
public class OrderMainApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainApplication80.class,args);
    }
}

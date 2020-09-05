package com.roothre2.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Roothre2
 * @create 2020-09-04  21:54:00
 */
@RestController
@RequestMapping("/consumer")
public class OrderZKController {

    public static final String INVOKE_URL = "http://springcloud-payment-service";


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public String urlTest(){
        return restTemplate.getForObject(INVOKE_URL+"/provider/payment",String.class);
    }
}

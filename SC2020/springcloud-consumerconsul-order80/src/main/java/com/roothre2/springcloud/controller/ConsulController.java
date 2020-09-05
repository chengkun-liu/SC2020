package com.roothre2.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Roothre2
 * @create 2020-09-05  07:47:00
 */
@RestController
@RequestMapping("/consumer")
public class ConsulController {


    public static final String INVOKE_URL = "http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consul")
    public String testUrl(){
       return restTemplate.getForObject(INVOKE_URL+"/provider/consul",String.class);
    }
}

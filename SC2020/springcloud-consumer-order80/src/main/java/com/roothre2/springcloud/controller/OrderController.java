package com.roothre2.springcloud.controller;

import com.roothre2.springcloud.common.Result;
import com.roothre2.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author Roothre2
 * @create 2020-09-02  22:55:00
 */
@RestController
@RequestMapping("/order/consumer")
@Slf4j
public class OrderController {

    //public static final String PAYMENT_PATH = "http://www.roothre2.com:8001/payment/provider";
    public static final String PAYMENT_PATH = "http://springcloud-payment-service/payment/provider";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/save")
    public Result<Payment> save(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_PATH + "/save", payment, Result.class);
    }


    @GetMapping("/get/{id}")
    public Result<Payment> findPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_PATH+"/get/"+id,Result.class);
    }

}

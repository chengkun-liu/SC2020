package com.roothre2.springcloud.controller;

import com.roothre2.springcloud.common.Result;
import com.roothre2.springcloud.entity.Payment;
import com.roothre2.springcloud.lb.MyLoadBalance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private MyLoadBalance myLoadBalance;

    @PostMapping("/save")
    public Result<Payment> save(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_PATH + "/save", payment, Result.class);
    }


    @GetMapping("/get/{id}")
    public Result<Payment> findPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_PATH+"/get/"+id,Result.class);
    }

    @GetMapping("/port")
    public String portTest(){

        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("SPRINGCLOUD-PAYMENT-SERVICE");
        for (ServiceInstance serviceInstance : serviceInstances) {
            System.out.println(serviceInstance.getUri());
        }
        ServiceInstance service = myLoadBalance.choose(serviceInstances);
        return restTemplate.getForObject(service.getUri()+"/payment/provider/port",String.class);
    }

}

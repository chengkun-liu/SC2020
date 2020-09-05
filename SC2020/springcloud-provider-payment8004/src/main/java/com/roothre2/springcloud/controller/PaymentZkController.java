package com.roothre2.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Roothre2
 * @create 2020-09-04  21:20:00
 */
@RestController
@RequestMapping("/provider")
public class PaymentZkController {



    @GetMapping("/payment")
    public String payment(){
        return "within zookeeper 8004 "+ UUID.randomUUID().toString();
    }
}

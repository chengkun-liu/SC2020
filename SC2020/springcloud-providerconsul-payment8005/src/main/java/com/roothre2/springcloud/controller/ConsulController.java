package com.roothre2.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Roothre2
 * @create 2020-09-05  07:42:00
 */
@RestController
@RequestMapping("/provider")
public class ConsulController {


    @Value("${server.port}")
    private String port;

    @GetMapping("/consul")
    public String urlTest(){
        return "with in "+port+": "+ UUID.randomUUID().toString();
    }
}

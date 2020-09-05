package com.roothre2.springcloud.controller;

import com.roothre2.springcloud.common.Result;
import com.roothre2.springcloud.entity.Payment;
import com.roothre2.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author Roothre2
 * @create 2020-09-02  22:09:00
 */
@RestController()
@RequestMapping("/payment/provider")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private Integer port;


    @PostMapping("/save")
    public Result<Payment> save(@RequestBody Payment payment){
        int resultNum = paymentService.save(payment);
        if(resultNum > 0){
            log.info("添加数据成功");
            return new Result<>(200,"添加数据成功!"+port,payment);
        }else {
            log.info("添加数据失败");
            return new Result<>(444,"添加数据失败!"+port,null);
        }
    }


    @GetMapping("/get/{id}")
    public Result<Payment> findPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.findPaymentById(id);
        if(payment != null){
            log.info("根据"+id+"查询数据成功！");
            return new Result<>(200,"根据"+id+"查询数据成功！"+port,payment);
        }else {
            log.info("根据"+id+"查询数据失败！");
            return new Result<>(444,"根据"+id+"查询数据失败！"+port,null);
        }
    }
}

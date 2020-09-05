package com.roothre2.springcloud.service;

import com.roothre2.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Roothre2
 * @create 2020-09-02  22:07:00
 */
public interface PaymentService {
    public int save(Payment payment);
    public Payment findPaymentById(Long id);
}

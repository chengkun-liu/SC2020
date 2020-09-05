package com.roothre2.springcloud.mapper;

import com.roothre2.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Roothre2
 * @create 2020-09-02  21:59:00
 */
@Mapper
public interface PaymentDao {
    public int save(Payment payment);
    public Payment findPaymentById(@Param("id") Long id);
}

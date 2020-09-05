package com.roothre2.springcloud.service.impl;

import com.roothre2.springcloud.entity.Payment;
import com.roothre2.springcloud.mapper.PaymentDao;
import com.roothre2.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Roothre2
 * @create 2020-09-02  22:07:00
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    @Transactional
    public int save(Payment payment) {
        return paymentDao.save(payment);
    }

    @Override
    @Transactional
    public Payment findPaymentById(Long id) {
        return paymentDao.findPaymentById(id);
    }
}

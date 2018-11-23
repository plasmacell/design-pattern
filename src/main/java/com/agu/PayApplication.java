package com.agu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@RequestMapping("/pay")
@RestController
@SpringBootApplication
public class PayApplication {

    private Logger logger = LoggerFactory.getLogger(PayApplication.class);

    @Autowired
    private PaymentMapper paymentMapper;

    // 限定金额是不断的在减少的，根据用户的入金金额来选择一个最佳的入金渠道
    @RequestMapping("/amount")
    @Transactional
    public String getInfo(@RequestParam int count) {
        logger.info("count：" + String.valueOf(count));
        // 查询到的payments是按照quota排过序的数组
        List<Payment> payments = paymentMapper.getPayment();
        logger.info("payments：" + payments.toString());
        for (Payment payment : payments) {
            int quota = payment.getQuota();
            int surplus = quota - count;
            if (surplus >= 0) {
                paymentMapper.update(surplus, payment.getName());
                logger.info("订单号：" + SearchDemo.getSerialNumber());
                logger.info("支付方式：" + payment.getName() + "  限额：" + quota);
                return "支付成功！ 支付方式：" + payment.getName() + "  限额：" + quota;
            }
        }
        int max = payments.get(payments.size() - 1).getQuota();
        if (max > 0) {
            logger.info("你当前最多能存" + max + "元");
            return "你当前最多能存" + max + "元";
        } else {
            return "error";
        }
    }

    @RequestMapping("/initQuota")
    public String resetQuota() {
        logger.info("init");
        List<Payment> payments = paymentMapper.getPayment();
        logger.info(payments.toString());
        for (Payment payment : payments) {
            int id = payment.getId();
            int initValue = payment.getInitValue();
            paymentMapper.init(initValue, id);
        }
        return "SUCCESS";
    }

    public static void main(String[] args) {
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                String s = new PayApplication().resetQuota();
                System.out.println(s);
            }
        }, 0, 20, TimeUnit.HOURS);
        SpringApplication.run(PayApplication.class, args);
    }
}

package com.agu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PayApplicationTests {

	@Autowired
	private PaymentMapper paymentMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getPayment() {
		List<Payment> payments = paymentMapper.getPayment();
		for (Payment payment : payments) {
			System.out.println("ID:" + payment.getId());
			System.out.println("Name:" + payment.getName());
			System.out.println("Quota:" + payment.getQuota());
			System.out.println();
		}
	}
}

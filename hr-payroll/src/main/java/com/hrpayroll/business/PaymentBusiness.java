package com.hrpayroll.business;

import org.springframework.stereotype.Service;

import com.hrpayroll.model.Payment;

@Service
public class PaymentBusiness {
	
	public Payment getPayment(Long workerId, Long days) {
		return new Payment("Bob", 200.0, days);
	}
	
}

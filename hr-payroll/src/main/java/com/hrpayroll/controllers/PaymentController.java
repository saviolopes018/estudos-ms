package com.hrpayroll.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrpayroll.business.PaymentBusiness;
import com.hrpayroll.model.Payment;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {
	
	@Autowired private PaymentBusiness paymentBusiness;
	
	@GetMapping("/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Long days){
		Payment payment = paymentBusiness.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}
	
}

package com.hrpayroll.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrpayroll.feignclients.WorkerFeignClient;
import com.hrpayroll.model.Payment;
import com.hrpayroll.model.Worker;

@Service
public class PaymentBusiness {

	@Autowired private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, Long days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}

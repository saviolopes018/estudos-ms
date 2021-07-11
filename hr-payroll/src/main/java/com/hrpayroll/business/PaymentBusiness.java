package com.hrpayroll.business;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hrpayroll.model.Payment;
import com.hrpayroll.model.Worker;

@Service
public class PaymentBusiness {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired private RestTemplate restTemplate;
	
	public Payment getPayment(Long workerId, Long days) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workerId);
		
		Worker worker = restTemplate.getForObject(workerHost + "/workers/buscar-por-id/{id}", Worker.class, uriVariables);
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}

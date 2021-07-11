package com.hrpayroll.model;

import java.io.Serializable;

public class Payment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dailyIncome;
	private Long days;
	
	public Payment() {
		
	}

	public Payment(String name, Double dailyIncome, Long days) {
		super();
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public Long getDays() {
		return days;
	}

	public void setDays(Long days) {
		this.days = days;
	}
	
	public double getTotal() {
		return days * dailyIncome;
	}
	
}

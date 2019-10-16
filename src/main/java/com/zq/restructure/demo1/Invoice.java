package com.zq.restructure.demo1;

public class Invoice {
	private String customer;
	private Performance[] performances;

	public Invoice(String customer, Performance[] performances) {
		this.customer = customer;
		this.performances = performances;
	}

	public Invoice() {
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Performance[] getPerformances() {
		return performances;
	}

	public void setPerformances(Performance[] performances) {
		this.performances = performances;
	}
}

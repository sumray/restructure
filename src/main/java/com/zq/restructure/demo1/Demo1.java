package com.zq.restructure.demo1;

import java.util.Map;

public class Demo1 {
	
	public String statement(Invoice invoice, Map<String, Play> plays){
		int totalAmount = 0;
		int volumeCredits = 0;
		String result = "Statement for " + invoice.getCustomer() + "\n";
		for (Performance perf : invoice.getPerformances()){
			Play play = plays.get(perf.getPlayId());
			int thisAmount = 0;
			switch (play.getType()){
				case "tragedy":
					thisAmount = 40000;
					if (perf.getAudience() > 30) {
						thisAmount += 1000 * (perf.getAudience() - 30);
					}
					break;
				case "comedy":
					thisAmount = 30000;
					if (perf.getAudience() > 20) {
						thisAmount += 10000 + 500 * (perf.getAudience() - 20);
					}
					thisAmount += 300 * perf.getAudience();
					break;
				default:
					throw new RuntimeException("不存在type");
			}
			volumeCredits += Math.max(perf.getAudience() - 30, 0);
			if ("comedy".equals(play.getType())) {
				volumeCredits += Math.floor(perf.getAudience() / 5);
			}
			result += "  " + play.getName() + ":" + thisAmount/100 + "("+ perf.getAudience() + " seats)\n";
			totalAmount += thisAmount;
		}
		result += "Amount owed is " + totalAmount/100 + "\n";
		result +=  "You earned " + volumeCredits + " credits\n";
		return result;
	}
	

}

package com.zq.restructure.demo1;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
public class TestDemo1 {
	@Test
	public void testStatement(){
		String trueResult = "Statement for BigCo\n" +
				"  Hamlet:650(55 seats)\n" +
				"  As You Like It:580(35 seats)\n" +
				"  Othello:500(40 seats)\n" +
				"Amount owed is 1730\n" +
				"You earned 47 credits";
		Demo1 d = new Demo1();
		Invoice invoice = Demo1Data.getInvoices().get(0);
		Map<String, Play> map = Demo1Data.getPlays();
		String statement = d.statement(invoice, map);
		System.out.println(statement);
	}
}

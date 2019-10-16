package com.zq.restructure.demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo1Data {
	public static Map<String, Play> getPlays(){
		Map<String, Play> map = new HashMap<>();
		Play p1 = new Play("Hamlet", "tragedy");
		Play p2 = new Play("As You Like It", "comedy");
		Play p3 = new Play("Othello", "tragedy");
		map.put("hamlet", p1);
		map.put("as-like", p2);
		map.put("othello", p3);
		return map;
	}



	public static List<Invoice> getInvoices(){
		Performance[] ps = new Performance[3];
		Performance p1 = new Performance("hamlet", 55);
		Performance p2 = new Performance("as-like", 35);
		Performance p3 = new Performance("othello", 40);
		ps[0] = p1;
		ps[1] = p2;
		ps[2] = p3;
		Invoice i = new Invoice();
		i.setPerformances(ps);
		i.setCustomer("BigCo");
		List<Invoice> list = new ArrayList<>();
		list.add(i);
		return list;
	}
}

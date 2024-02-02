package com.prowings.identityHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lhs = new LinkedHashMap<String, Integer>();
		
		lhs.put("aaa", 123);
		lhs.put("bbb", 456);
		lhs.put("ccc", 658);
		lhs.put("ddd", 123);
		lhs.put("aaa", 123);
		
		System.out.println(lhs);

	}

}

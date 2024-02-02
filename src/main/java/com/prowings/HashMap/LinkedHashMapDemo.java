package com.prowings.HashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();

		System.out.println(hm.put("aaa", 123));
		System.out.println(hm.put("bbb", 435));
		System.out.println(hm.put("ccc", 456));
		System.out.println(hm.put(null, null));
		System.out.println(hm.put("aaa", null));
		System.out.println(hm.put("bbb", 123));
		System.out.println(hm.put("zzz", 687));
		System.out.println(hm.put(null, null));
		System.out.println(hm.put("iii", 687));
		
		System.out.println(hm);

	}

}

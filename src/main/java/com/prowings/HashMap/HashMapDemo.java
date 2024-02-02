package com.prowings.HashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		System.out.println("Initial capacity " + hm.size());
		
		System.out.println(hm.put("aaa", 123));
		System.out.println("Initial capacity " + hm.size());
		System.out.println(hm.put("bbb", 435));
		System.out.println(hm.put("ccc", 456));
		System.out.println(hm.put(null, null));
		System.out.println(hm.put("aaa", null));
		System.out.println(hm.put("bbb", 123));
		System.out.println(hm.put("zzz", 687));
		System.out.println(hm.put(null, null));
		System.out.println(hm.put("iii", 687));
			
		System.out.println(hm);
		
		System.out.println(hm.containsKey("bbb"));
		
		System.out.println(hm.containsValue(687));
		
		System.out.println(hm.get("bbb"));
		
		System.out.println(hm.remove("iii", 687));
		
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.entrySet());
		
		
		
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<,");	
		hm2.putAll(hm);
		hm2.put("Gaurav" , 123);
		
		System.out.println(hm2);
		
		
		hm2.clear();
		
		System.out.println(hm2);

	}

}

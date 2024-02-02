package com.prowings.HashMap;

import java.util.*;

public class IterateHashMapWithMultipleWays {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("aaa", 10);
		hm.put("bbb", 20);
		hm.put("ccc", 30);
		hm.put("ddd", 40);
		hm.put("eee", 50);

		System.out.println(hm);

		wayOneToIterate(hm);
		wayTwoToIterate(hm);
		wayThreeToIterate(hm);
		wayFourToIterate(hm);
		wayFiveToIterate(hm);

	}

	public static void wayOneToIterate(HashMap<String, Integer> hm) {

		System.out.println();
		System.out.println("Way 1 = Iterate on KeySet");

		Set<String> setOfKeys = hm.keySet();

		Iterator<String> itr = setOfKeys.iterator();

		while (itr.hasNext()) {
			String key = itr.next();

			System.out.println("Key : " + key + ", Value : " + hm.get(key));
		}

	}

	public static void wayTwoToIterate(HashMap<String, Integer> hm) {
		System.out.println();
		System.out.println("Way 2 = Iterator on Entryset");

		Set<Map.Entry<String, Integer>> setOfEntries = hm.entrySet();
		Iterator<Map.Entry<String, Integer>> itr = setOfEntries.iterator();

		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();

			System.out.println("Key : " + entry.getKey() + "  Value : " + entry.getValue());
		}

	}

	public static void wayThreeToIterate(HashMap<String, Integer> hm) {

		System.out.println();
		System.out.println("Way 3 = ForEach on Values()");

		for (Integer values : hm.values()) {

			System.out.println("Values : " + values);
		}

		System.out.println();
		for (String keys : hm.keySet()) {

			System.out.println("Keys : " + keys);
		}
	}

	public static void wayFourToIterate(HashMap<String, Integer> hm) {

		System.out.println();
		System.out.println("Way 4 = Iterator on Entryset");

	}

	public static void wayFiveToIterate(HashMap<String, Integer> hm) {

		System.out.println();
		System.out.println("Way 5 = Iterator on Entryset");

	}
}

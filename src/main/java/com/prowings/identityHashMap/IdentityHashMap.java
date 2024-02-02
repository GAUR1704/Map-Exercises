package com.prowings.identityHashMap;

import java.util.Map;

public class IdentityHashMap {

	public static void main(String[] args) {
		
		Car car1 = new Car(2021, "Ferari");
		Car car2 = new Car(2023, "Mercedez");
		Car car3 = new Car(2022, "Range Rover");
		Car car4 = new Car(2023, "Mercedez");
		Car car5 = new Car(2024, "Rolls Royce");
		Car car6 = car2;
		
		Map<Car, String> vehical = new java.util.IdentityHashMap<Car, String>();
		
		vehical.put(car1, "aaa");
		vehical.put(car2, "bbb");
		vehical.put(car3, "ccc");
		vehical.put(car4, "ddd");
		vehical.put(car5, "eee");
		vehical.put(car6, "fff");
		
		System.out.println(vehical);
		

	}

}

package com.prowings.HashMap;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class searchContactNameByMobileWay3 {

	public static void main(String[] args) {

		Map<String, HashSet<Double>> contactDetails = new LinkedHashMap<>();

		HashSet<Double> guruPhoneNumbers = new HashSet<>();
		guruPhoneNumbers.add(8308075731d);

		HashSet<Double> gauravPhoneNumbers = new HashSet<>();
		gauravPhoneNumbers.add(9595172104d);

		HashSet<Double> atulPhoneNumbers = new HashSet<>();
		atulPhoneNumbers.add(9594272053d);

		HashSet<Double> pramodPhoneNumbers = new HashSet<>();
		pramodPhoneNumbers.add(9595092664d);

		contactDetails.put("This is Guru's Phone number.", guruPhoneNumbers);
		contactDetails.put("This is Gaurav's Phone number", gauravPhoneNumbers);
		contactDetails.put("This is Atul's Phone number", atulPhoneNumbers);
		contactDetails.put("This is Pramod's Phone number", pramodPhoneNumbers);

		// Long mobileNum = 12121212l;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Mobile Number : ");

		Double mobileNum = scan.nextDouble();


		searchContactNameByMobile(mobileNum, contactDetails);

		scan.close();
		// System.out.println(result);

	}

	public static void searchContactNameByMobile(Double mobileNum, Map<String, HashSet<Double>> contactDetails) {

		String name = "";

		first:
			for (Map.Entry<String, HashSet<Double>> entry : contactDetails.entrySet()) {

			String key = entry.getKey();

			HashSet<Double> value = entry.getValue();

			if (value.contains(mobileNum)) {

				name = key;
				break first;
//				System.out.println(name);
				
			}

			else
				name = "This number is not found";	
			
		}
		System.out.println(name);

		
		
		
		
		//		Iterator<Map.Entry<String, HashSet<Double>>> itr = contactDetails.entrySet().iterator();
//		
//		while(itr.hasNext()) {
//			Map.Entry<String, HashSet<Double>> m=itr.next();
//			//System.out.println(m);
//			
//			//System.out.println(m.getValue());
//			if(m.getValue().contains(mobileNum)) {
//				System.out.println(m.getKey());
//				break;
//			}
//			else
//				System.out.println("number not found");
//			break;
//
//			
//		}
	}
}

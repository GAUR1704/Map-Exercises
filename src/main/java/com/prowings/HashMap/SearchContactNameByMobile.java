package com.prowings.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class SearchContactNameByMobile {

	public static void main(String[] args) {

		Map<String, HashSet<Long>> contactDetails = new HashMap<>();

		HashSet<Long> ramsPhoneNumbers = new HashSet<>();
		ramsPhoneNumbers.add(111122224444l);
		ramsPhoneNumbers.add(555566668888l);
		ramsPhoneNumbers.add(999977773333l);

		HashSet<Long> shamsPhoneNumbers = new HashSet<>();
		shamsPhoneNumbers.add(12121212l);
		shamsPhoneNumbers.add(23232323l);
		shamsPhoneNumbers.add(45454545l);

		contactDetails.put("Ram", ramsPhoneNumbers);
		contactDetails.put("Sham", shamsPhoneNumbers);

		Long mobileNum = 999977773333l;
		searchContactNameByMobile(mobileNum, contactDetails);

	}

	public static void searchContactNameByMobile(Long mobileNum, Map<String, HashSet<Long>> contactDetails) {

		Iterator<Map.Entry<String, HashSet<Long>>> itr = contactDetails.entrySet().iterator();

		while (itr.hasNext()) {

			Map.Entry<String, HashSet<Long>> s = itr.next();

//			 System.out.println(s.getKey()+" "+s.getValue());

			for (Long l : s.getValue()) {

//				 System.out.println(l);

				if (l.equals(mobileNum))

					System.out.println(s.getKey());
			}
		}

	}

}

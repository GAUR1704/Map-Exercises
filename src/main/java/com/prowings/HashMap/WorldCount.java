package com.prowings.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WorldCount {

	public static void main(String[] args) {
		
		
		String line = "India is my country india is very big county india is beautiful Country";
		
		getWordCount(line);
		

	}

	public static void getWordCount(String line) {
		
		String[] words  = line.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String word : words) {
			
			if(wordCount.containsKey(word)) {
				
				int existingWordCount = wordCount.get(word);
				
				wordCount.put(word, existingWordCount+1);
			}
			else
				wordCount.put(word, 1);
		}
		
		Set<Map.Entry<String, Integer>> setOfEntries = wordCount.entrySet();
		
		for(Map.Entry<String,Integer> entries : setOfEntries) {
			
			System.out.println("Words : " + entries.getKey() + "-> Occurance : " + entries.getValue());
		}
		
		
	}

}

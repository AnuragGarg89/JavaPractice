package com.practice.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfAWordInAStringArray {

	Map<String, Integer> map = new HashMap<String, Integer>();

	public void frequencyOfAWordInAStringArray(String[] str) {
		for (int i = 0; i < str.length; i++) {
			if (map.containsKey(str[i])) {
				map.put(str[i], map.get(str[i]) + 1);
			} else {
				map.put(str[i], 1);
			}
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Value : "+entry.getKey()+" is repeated : "+entry.getValue()+" times");
		}
	}

	public static void main(String[] args) {
		String [] str = { "Anu", "rag", "garg", "Anu", "garg","garg"};
		FrequencyOfAWordInAStringArray freq = new FrequencyOfAWordInAStringArray();
		freq.frequencyOfAWordInAStringArray(str);

	}

}

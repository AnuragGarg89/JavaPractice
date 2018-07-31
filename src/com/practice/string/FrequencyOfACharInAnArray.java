package com.practice.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfACharInAnArray {

	public void frequency(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " is repeated " + entry.getValue()+" times");
		}
	}

	public static void main(String[] args) {
		FrequencyOfACharInAnArray freq = new FrequencyOfACharInAnArray();
		freq.frequency("anuragggg");

	}

}

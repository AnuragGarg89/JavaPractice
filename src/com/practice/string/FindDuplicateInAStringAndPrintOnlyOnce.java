package com.practice.string;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInAStringAndPrintOnlyOnce {

	Set<Character> set = new HashSet<Character>();

	public void duplicateAndPrintOnce(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) != ' ' && (str.charAt(i) == str.charAt(j))) {
					set.add(str.charAt(i));
				}
			}
		}
		for (Character ch : set) {
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {

		FindDuplicateInAStringAndPrintOnlyOnce fd = new FindDuplicateInAStringAndPrintOnlyOnce();
		fd.duplicateAndPrintOnce("My Name is Anuragya");
	}
}

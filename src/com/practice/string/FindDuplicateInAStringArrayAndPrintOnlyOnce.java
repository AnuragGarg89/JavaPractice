package com.practice.string;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInAStringArrayAndPrintOnlyOnce {

	Set<String> set = new HashSet<String>();

	public void duplicateInAnArrayAndPrintOnlyOnce(String[] str) {

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					set.add(str[i]);
				}
			}
		}
		
		for(String s: set) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {

		FindDuplicateInAStringArrayAndPrintOnlyOnce fd = new FindDuplicateInAStringArrayAndPrintOnlyOnce();
		String[] str = { "My", "My", "Name", "is", "Anurag", "garg", "garg", "My" };
		fd.duplicateInAnArrayAndPrintOnlyOnce(str);
	}

}

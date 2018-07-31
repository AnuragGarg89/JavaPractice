package com.practice.string;

public class FindDuplicateInAString {

	public void duplicate(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) != ' ' && (str.charAt(i) == str.charAt(j))) {
					System.out.println("Duplicate = " + str.charAt(i));
				}
			}
		}
	}

	public static void main(String[] args) {

		FindDuplicateInAString fd = new FindDuplicateInAString();
		fd.duplicate("My Name is Anuragya");
	}

}

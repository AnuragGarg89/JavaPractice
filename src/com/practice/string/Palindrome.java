package com.practice.string;

public class Palindrome {

	public void checkPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("Original String is : " + str);
		System.out.println("Reversed string is : " + sb);
		if (str.equalsIgnoreCase(sb.toString())) {
			System.out.println("IT'S A PALINDROME");
		} else {
			System.out.println("NOT A PALINDROME");
		}
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		palindrome.checkPalindrome("madaM");
	}

}

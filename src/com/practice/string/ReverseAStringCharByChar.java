package com.practice.string;

public class ReverseAStringCharByChar {

	public void reverse(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		ReverseAStringCharByChar swsr = new ReverseAStringCharByChar();
		swsr.reverse("HelloWorld");
		swsr.reverse("Hello World again");

	}

}

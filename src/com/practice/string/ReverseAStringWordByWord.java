package com.practice.string;

public class ReverseAStringWordByWord {

	public void reverse(String str) {
		String arr[] = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i != 0) {
				System.out.print(arr[i] + " ");
			} else
				System.out.print(arr[i]);
		}
	}

	public static void main(String... args) {
		ReverseAStringWordByWord sr = new ReverseAStringWordByWord();
		sr.reverse("India is my country");
	}

}

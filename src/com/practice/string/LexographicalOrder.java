package com.practice.string;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class LexographicalOrder {

	public void printLexo(String str) {
		Set<String> list = new TreeSet<>();
		int length = str.length();
		System.out.println(length);
		for (int i = 0; i <= (length - 3); i++) {
			list.add(str.substring(i, i+3));

		}
		
		for(String s: list) {
			System.out.println(s);	
		}
		

		//Collections.sort(list);
		//System.out.println("/**********************/");
		
	}

	public static void main(String[] args) {

		LexographicalOrder lo = new LexographicalOrder();
		lo.printLexo("welcometomarkit");

	}

}

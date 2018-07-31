package com.practice.numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxContinousSubArraySum {
	int max_so_far = 0;
	int max_ending_here = 0;
	
	Set<String> m = new HashSet<>();
	List<String> l = new ArrayList<>();
	
	

	public void sum(int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			max_ending_here = max_ending_here + arr[i];
			if (max_ending_here < 0) {
				max_ending_here = 0;
			} else {
				if (max_so_far < max_ending_here) {
					max_so_far = max_ending_here;
				}
						
			}
			
		}
		m.add(null);
		m.add(null);

		l.add(null);
		l.add(null);
		l.add("");
		
		System.out.println(m);
		System.out.println(l);
		
		
		System.out.println("Maximum continous sum in the array is " + max_so_far);

	}

	public static void main(String[] args) {
		MaxContinousSubArraySum msas = new MaxContinousSubArraySum();
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		msas.sum(arr);
	}

}

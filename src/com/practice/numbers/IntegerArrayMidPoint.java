package com.practice.numbers;

public class IntegerArrayMidPoint {

	public void midPoint(int[] arr) {
		int length = arr.length;
		int sumOfArrayInForwardDirection = 0;
		int sumOfArrayInBackwardDirection = 0;

		for (int i = 1; i < length; i++) {
			sumOfArrayInForwardDirection = sumOfArrayInForwardDirection + arr[i];
		}
		for (int i = 1, j = 0; j < length; i++, j++) {
			sumOfArrayInForwardDirection = sumOfArrayInForwardDirection - arr[j];
			sumOfArrayInBackwardDirection = sumOfArrayInBackwardDirection + arr[i];
			if (sumOfArrayInForwardDirection == sumOfArrayInBackwardDirection) {
				System.out.println("Mid Point is " + arr[i + 1]);
			}
		}

	}

	public static void main(String[] args) {
		IntegerArrayMidPoint iamp = new IntegerArrayMidPoint();
		int arr[] = { 1, 3, 5, 4, 1, 3, 5 };
		iamp.midPoint(arr);

	}

}

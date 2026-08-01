package com.Arrays;

public class CalculateSum {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 7, 89, 23, 56 };
		int sum = 0;
		for (int ele : arr)
			sum += ele;

		System.out.println("Sum of element is " + sum);
	}

}

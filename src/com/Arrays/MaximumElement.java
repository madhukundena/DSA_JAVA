package com.Arrays;

public class MaximumElement {
	public static void main(String[] args) {
		int arr[] = { 10, 9, 8, 6, 1, 20, 25, 30, 35 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.print("Maximum element is: " + max);
	}
}

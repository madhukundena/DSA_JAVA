package com.Arrays;

public class MaximumMinimumElement {
	public static void main(String[] args) {
		int arr[] = { 10, 9, 8, 6, 1, 20, 25, 30, 35 };
		int max = arr[0];
		int min = arr[0];
		for (int ele : arr) {
			max = Math.max(max, ele);
			min = Math.min(min, ele);
			/*
			 * if (max < ele) {max = ele} 
			 * if (min > ele){ min = ele}
			 */
		}
		System.out.println("Maximum element is: " + max);
		System.out.println("Minimum element is: " + min);
		for (int ele : arr) {
		}
	}
}

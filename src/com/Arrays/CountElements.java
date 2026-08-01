package com.Arrays;

public class CountElements {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 7, 89, 23, 56 };
		int count = 0;

		System.out.println("Lenght of array: " + arr.length);
		for (int ele : arr) {
			count++;
		}
		System.out.println("Lenght of array using traversal: " + count);
	}

}

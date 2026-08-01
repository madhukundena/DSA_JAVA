package com.Arrays;

//Linear search
public class Search {
	public static void main(String[] args) {
		int arr[] = { 10, 9, 8, 6, 1, 20, 25, 30, 35 };
		int target = 30;
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				System.out.println("Found the element: " + arr[i]);
				break;
			}
		}

	}
}

//Time O(n)
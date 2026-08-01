package com.Arrays;

public class SortedArray {
	public static void main(String args[]) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		int[] arr = {10, 30, 20, 40};
		int left = 0;
		int right = arr.length - 1;
		boolean isSorted = true;

		// 1
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] > arr[i + 1]) {
				isSorted = false;
			}
		}

		if (isSorted) {
			System.out.println("sorted");
		} else {
			System.out.println("Not Sorted");
		}

		// 2
		isSorted = true;
		while (left < right) {
			if (arr[left] < arr[right]) {
				left++;
				right--;
			} else {
				isSorted = false;
				break;
			}
		}

		if (isSorted) {
			System.out.println("sorted");
		} else {
			System.out.println("Not Sorted");
		}
	}
}

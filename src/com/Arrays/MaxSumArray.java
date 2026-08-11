package com.Arrays;

public class MaxSumArray {
	public static int getMaxSum(int arr[], int k) {
		int windowsum = 0;

		for (int i = 0; i < k; i++) {
			windowsum += arr[i];
		}
		int maxSum = windowsum;
		for (int j = k; j < arr.length; j++) {
			windowsum = arr[j] + windowsum - arr[j - k];
			if (maxSum < windowsum) {
				maxSum = windowsum;
			}
		}
		return maxSum;
	}

	public static void main(String args[]) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;
		System.out.println(getMaxSum(arr, k));
	}
}

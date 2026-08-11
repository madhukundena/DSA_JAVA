package com.Arrays;


public class RemoveDuplicates {
	public static void main(String args[]) {
		int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5 };
		int left = 0;

		for (int right = 1; right < arr.length; right++) {
			if (arr[left] != arr[right]) {
				left++;
				arr[left] = arr[right];
			}
		}
		int uniquieCount = left + 1;
		System.out.println("Total Count:" + uniquieCount);
		System.out.print("Array: ");
		for (int i = 0; i < uniquieCount; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

/* output:
 * Total Count:5
 * Array: 1 2 3 4 5
 * Time: O(n)
 * Space: O(1)
 */


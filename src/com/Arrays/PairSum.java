package com.Arrays;

//sorted Array
public class PairSum {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 6 };
		int target = 6;
		int left = 0;
		int right = arr.length - 1;
		boolean found = false;
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				System.out.println("Pair Found: " + arr[left] + " + " + arr[right] + " = " + target);
				found = true;
				break;
			}
			if (sum < target)
				left++;
			else
				right--;
		}
		if (!found) {
			System.out.println("Not found " + target);
		}
	}
}

/*
 * Output: Pair Found: 2 + 4 = 6 
 * if sort + two pointer O(n log n)
 */
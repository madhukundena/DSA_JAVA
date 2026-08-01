package com.Arrays;

import java.util.Arrays;

public class Palindrome {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1 };
		int left = 0;
		int right = arr.length - 1;
		boolean isPalindrome = true;
		while (left < right) {
			if (arr[left] != arr[right]) {
				isPalindrome = false;
				break;
			}
			left++;
			right--;
		}
		if (isPalindrome) {
			System.out.print(Arrays.toString(arr) + " is a Palindrome");
		} else {
			System.out.print(Arrays.toString(arr) + " is not a Palindrome");

		}
	}
}

/*
 * output: [1, 2, 3, 2, 1] is a Palindrome
*/
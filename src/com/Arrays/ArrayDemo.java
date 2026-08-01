package com.Arrays;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {

		// 1 Array Declaration and Initialization
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		System.out.print("Array is ");
		System.out.println(Arrays.toString(arr));

		// 2 accessing Elements
		System.out.println("\nFirst Element: " + arr[0]);
		System.out.println("Last element: " + arr[arr.length - 1]);

		// 3 Updating elements
		arr[2] = 300;
		System.out.println("\nAfter updating Index 2:");
		System.out.println(Arrays.toString(arr));

		// 4 Length
		System.out.println("\nLength " + arr.length);

		// 5 Traversing using for loop
		System.out.println("\nTraversing the array using loop:");
		for (int i = 0; i < arr.length - 1; i++)
			System.out.print(arr[i] + " ");

		// 6 for Each Loop
		System.out.println("\n\nUsing for Each-loop:");
		for (int a : arr)
			System.out.print(a + " ");
		System.out.println();

		// 7. Sum of Elements
		int sum = 0;
		for (int ele : arr)
			sum += ele;
		System.out.println("\nSum = " + sum);

		// 8 Average
		double avg = (double) sum / arr.length;
		System.out.println("\nAverage = " + avg);

		// 9. Maximum element
		int max = arr[0];
		for (int ele : arr) {
			if (ele > max)
				max = ele;
		}
		System.out.println("\nMaximum Element = " + max);

		// 10 Minimum Element
		int min = arr[0];
		for (int ele : arr) {
			if (ele < min)
				min = ele;
		}
		System.out.println("\nMinimum element = " + min);

		// 11. Search Element
		int target = 40;
		boolean found = false;

		for (int ele : arr) {
			if (ele == target) {
				found = true;
				break;
			}
		}
		System.out.println("\n40 Found?: " + found);

		// 12 Sorting Array
		Arrays.sort(arr);
		System.out.println("\nSorted Array");
		System.out.println(Arrays.toString(arr));

		// 13 Copying Array
		int[] copy = Arrays.copyOf(arr, arr.length);
		System.out.println("\nCopied Array");
		System.out.println(Arrays.toString(copy));

		// 14 Reverse Array
		System.out.println("\nReverse Array: ");
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i] + " ");
	}
}

/*
 * output: Array is [10, 20, 30, 40, 50, 60]
 * 
 * First Element: 10 Last element: 60
 * 
 * After updating Index 2: [10, 20, 300, 40, 50, 60]
 * 
 * Length 6
 * 
 * Traversing the array using loop: 10 20 300 40 50
 * 
 * Using for Each-loop: 10 20 300 40 50 60
 * 
 * Sum = 480
 * 
 * Average = 80.0
 * 
 * Maximum Element = 300
 * 
 * Minimum element = 10
 * 
 * 40 Found?true
 * 
 * Sorted Array [10, 20, 40, 50, 60, 300]
 * 
 * Copied Array [10, 20, 40, 50, 60, 300]
 * 
 * Reverse Array: 300 60 50 40 20 10
 */
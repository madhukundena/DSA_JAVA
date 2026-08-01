package com.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 6 };
		System.out.print("Array is ");
		for (int a : arr)
			System.out.print(a + " ");
		System.out.println();
		System.out.println("Length of Array: " + arr.length);
	}
}

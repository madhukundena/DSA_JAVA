package com.Arrays;

public class BinarySearch {
	public static boolean bsearch(int arr[],int target) {
		int low =0;
		int high =arr.length-1;
		while(low<=high) {
//			int mid = (left+right)/2;
			int mid = low + (high - low) / 2;
			if(arr[mid]==target) {
				return true;
			}
			else if(arr[mid]>target) {
				high =mid-1;
			}
			else {
				low =mid+1;
			}
		}
		
		return false;
	}
	public static void main(String args[]) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70};
		int target = 50;
		System.out.println("Target "+target+" found: "+bsearch(arr,target));
		target =10;
		System.out.println("Target "+target+" found: "+bsearch(arr,target));
		target =70;
		System.out.println("Target "+target+" found: "+bsearch(arr,target));
	}

}

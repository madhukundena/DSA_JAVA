package com.Arrays;

public class FirstOccurrence {
	public static int getFirstOcurance(int arr[],int target) {
		int low =0;
		int high = arr.length;
		int targetOcurance = -1;
		while(low<=high) {
			int mid = low +(high-low)/2;
			if(arr[mid]==target) {
				targetOcurance = mid;
				high =mid-1;
			}
			else if(arr[mid]>target) {
				high = mid-1;
			}
			else {
				low =mid+1;
			}
		}
		
		return targetOcurance;
	}

	public static void main(String args[]) {
		int[] arr = {1, 2, 2, 2, 3, 4, 5};
		int target = 2;
		System.out.println("first ocurance of "+target+" is "+getFirstOcurance(arr, target));
		target =3;
		System.out.println("first ocurance of "+target+" is "+getFirstOcurance(arr, target));
		target =4;		
		System.out.println("first ocurance of "+target+" is "+getFirstOcurance(arr, target));
		target =5;
		System.out.println("first ocurance of "+target+" is "+getFirstOcurance(arr, target));
		target =1;
		System.out.println("first ocurance of "+target+" is "+getFirstOcurance(arr, target));
	}

}

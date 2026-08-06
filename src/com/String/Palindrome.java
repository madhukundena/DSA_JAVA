package com.String;

public class Palindrome {
	public static boolean isValidPalindrome(String str) {
		int strlen = str.length();
		str = str.toLowerCase();

		/*
		 * for(int left =0;left<strlen/2;left++) { int right = strlen -1 - left;
		 * if(str.charAt(left) != str.charAt(right)) { return false; } }
		 */
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;

	}

	public static boolean isSymmetric(String str) {
		int strlen = str.length();
		if (str.length() % 2 != 0) {
			return false;
		}
		if (str.substring(0, strlen / 2).equals(str.substring(strlen / 2))) {
			return true;
		}

		return false;
	}

	public static void main(String args[]) {
		String str = "Madam";
		System.out.println("is " + str + " a palidrome " + isValidPalindrome(str));
		System.out.println("is " + str + " a Symmetric " + isSymmetric(str));

		String str1 = "abcabc";
		System.out.println("is " + str1 + " a palidrome " + isValidPalindrome(str1));
		System.out.println("is " + str1 + " a Symmetric " + isSymmetric(str1));
	}

}

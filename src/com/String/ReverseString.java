package com.String;

public class ReverseString {
	public static String reverseStr(String str) {
		StringBuffer sb = new StringBuffer(str);
		int strlen = sb.length();

		for (int i = 0; i < strlen / 2; i++) {
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(strlen - 1 - i));
			sb.setCharAt(strlen - 1 - i, temp);

		}

		return sb.toString();
	}

	public static void main(String args[]) {
		String str = "programming";
		System.out.println(reverseStr(str));
	}
}

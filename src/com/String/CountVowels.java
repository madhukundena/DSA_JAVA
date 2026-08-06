package com.String;

public class CountVowels {

	private static int getCountVowels(String str) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if ("AEOIUaeiou".indexOf(ch) != -1) {
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		String str = "Programming";
		System.out.println("Count of vowels in " + str + " is " + getCountVowels(str));

		str = "Java";
		System.out.println("Count of vowels in " + str + " is " + getCountVowels(str));

		str = "Madhu";
		System.out.println("Count of vowels in " + str + " is " + getCountVowels(str));

	}

}

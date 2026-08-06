package com.String;

public class NonRepeatingCharacter {
	public static char nonRepeatingCharacter(String str) {
		char ch = '\0';
		if (str == null || str.isEmpty())
			return '\0';
		for (int i = 0; i < str.length(); i++) {
			if (str.lastIndexOf(str.charAt(i)) == str.indexOf(str.charAt(i))) {
				return str.charAt(i);
			}
		}
		return ch;
	}

	public static void main(String args[]) {
		String str = "programming";
		System.out.println(nonRepeatingCharacter(str));

	}

}

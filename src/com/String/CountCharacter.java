package com.String;

public class CountCharacter {
	public static int frequency(String str, char target) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			//if(Character.toLowerCase(ch) == Character.toLowerCase(target))
			if (ch == target) {
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		String str = "programming";
		char target = 'm';
		System.out.println("Count of " + target + " in " + str + " is " + frequency(str, target));
	}

}

package com.String;

public class FindFrequency {

	public static void frequency(String str) {
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			boolean alreadyprinted = false;
			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					alreadyprinted = true;
					break;
				}
			}
			if (!alreadyprinted) {
				for (int k = i; k < str.length(); k++) {
					if (str.charAt(i) == str.charAt(k))
						count++;

				}

				System.out.println(str.charAt(i) + " = " + count);
			}
		}
	}

	public static void main(String[] args) {
		String str = "programming";
		System.out.println("frequecy is ");
		frequency(str);
	}
}

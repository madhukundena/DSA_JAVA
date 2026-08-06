package com.String;

public class MostFrequentCharacter {
	public static char findMostFrequentChar(String str) {
		char maxchar = '\0';
		int maxCount = 0;
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			boolean alreadycounted = false;
			for (int k = 0; k < i; k++) {
				if (str.charAt(i) == str.charAt(k)) {
					alreadycounted = true;
					break;
				}
			}
			if (alreadycounted) {
				continue;
			}
			for (int j = i; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxchar = str.charAt(i);
			}
		}
		return maxchar;
	}

	public static void main(String args[]) {
		String str = "programming";
		System.out.println(findMostFrequentChar(str));
		System.out.println(findMostFrequentChar("aaabbb"));
		System.out.println(findMostFrequentChar("abcdee"));
	}
}

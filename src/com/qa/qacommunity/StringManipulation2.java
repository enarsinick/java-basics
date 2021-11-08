package com.qa.qacommunity;

public class StringManipulation2 {

	public static void main(String[] args) {

		System.out.println(countWords("Hello"));
		verticalString("Hello");
		verticalStringReverse("Goodbye");
		findWord("That's the way the cookie crumbles", "cookie");
	}
	
	// When given a String, count and return 
	// how many words there are in that String.
	public static int countWords(String word) {
		return word.length();
	}
	
	public static void verticalString(String word) {
		for (int i = 1; i <= word.length(); i++ ) {
			System.out.println(word.substring(i - 1, i));
		}
	}
	
	public static void verticalStringReverse(String word) {
		for (int i = word.length(); i >= 1; i--) {
			System.out.println(word.substring(i - 1, i));
		}
	}
	
//	public static boolean findWord(String message, String word) {
//		
//		int start = 0;
//		int end = word.length();
//		
//		for (int i = 0; i < message.length(); i++) {
//			if (message.substring(start, end).equals(word)) {
//				return true;
//			} else {
//				start += end;
//				end += end;
//			}
//		}
//	}

}

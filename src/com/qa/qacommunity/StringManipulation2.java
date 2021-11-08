package com.qa.qacommunity;

public class StringManipulation2 {

	public static void main(String[] args) {

//		System.out.println(countWords("That's the way the cookie crumbles"));
//		verticalString("That's the way the cookie crumbles");
//		verticalStringReverse("That's the way the cookie crumbles");
		System.out.println(findWord("That's the way the cookie crumbles", "cookie"));
	}
	
	// When given a String, count and return 
	// how many words there are in that String.
	public static int countWords(String message) {
		int numOfWords = 0;
		
		for (int i = 0; i < message.length(); i++) {
			if (message.substring(i, i + 1).equals(" ")) numOfWords++;
		}
		
		return numOfWords + 1;
	}
	
	public static void verticalString(String message) {
		String word = "";
		String letter;
		
		for (int i = 0; i < message.length(); i++) {
			letter = message.substring(i, i + 1);
			if (!letter.equals(" ")) {
				word += letter ;
			} else {
				System.out.println(word);
				word = "";
			}
		}
	}
	
	public static void verticalStringReverse(String message) {
		String word = "";
		String letter;
		
		for (int i = message.length(); i >= 1; i--) {
			letter = message.substring(i - 1, i);
			if (!letter.equals(" ")) {
				word += letter ;
			} else {
				System.out.println(word);
				word = "";
			}
		}
	}
	
	public static boolean findWord(String message, String search) {
		
		String word = "";
		String letter;
		
		for (int i = 0; i < message.length(); i++) {
			letter = message.substring(i, i + 1);
			if (!letter.equals(" ")) {
				word += letter ;
			} else {
				if (word.equals(search)) {
					return true;
				}
				word = "";
			}
		}
		return false;
	}

}

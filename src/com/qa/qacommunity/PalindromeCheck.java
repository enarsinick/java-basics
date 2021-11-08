package com.qa.qacommunity;

public class PalindromeCheck {

	public static void main(String[] args) {

		System.out.println(checkForPalindrome("rotator"));
		
	}
	
	public static boolean checkForPalindrome(String word) {
		
		int start = 0;
		int end = word.length() - 1;
		
		while(end > start) {
			if (word.charAt(start) == word.charAt(end)) {
				start++;
				end--;
			} else {
				return false;
			}
		}
		
		return true;
		
	}

}

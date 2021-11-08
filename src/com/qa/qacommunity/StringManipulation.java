package com.qa.qacommunity;

public class StringManipulation {

	public static void main(String[] args) {

		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		
		System.out.println(str2.toUpperCase() + ", " + str1.toUpperCase());
		
		String newString = str2.substring(0, 11) + " " + str1.substring(17, 24);
		System.out.println(newString);
		
	}

}

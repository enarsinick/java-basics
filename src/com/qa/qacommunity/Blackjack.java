package com.qa.qacommunity;

public class Blackjack {

	public static void main(String[] args) {

		System.out.println(blackjack(10, 5));
		System.out.println(blackjack(24, 15));
		System.out.println(blackjack(25, 25));
		
		
	}

	public static int blackjack(int a, int b) {
		
		int result1 = 21 - a;
		int result2 = 21 - b;
		
		if (result1 < 0 && result2 < 0) {
			System.out.println("Both go over 21");
			return 0;
		} else if (result1 > result2) {
			System.out.println("Num 2 is closest");
			return b;
		} else {
			System.out.println("Num 1 is closest");
			return a;
		}

	}
	
}

package com.qa.qacommunity;

public class UniqueSum {

	public static void main(String[] args) {

		System.out.println(input(1, 2, 2));
		
	}
	
	public static int input(int a, int b, int c) {
		
		int sum = 0;
		
		if (a != b) {
			if (a != c) {
				sum += a;
			}
		}
		
		if (b != a) {
			if (b != c) {
				sum += b;
			}
		}
		
		if (c != a) {
			if (c != b) {
				sum += c;
			}
		}
		
		return sum;
		
	}

}

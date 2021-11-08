package com.qa.qacommunity;

public class FizzBuzz {

	public static void main(String[] args) {

//		System.out.println(fizzBuzz(5));
//		System.out.println(fizzBuzz(7));
//		System.out.println(fizzBuzz(8));
//		System.out.println(fizzBuzz(0));
//		System.out.println(fizzBuzz(12));
//		System.out.println(fizzBuzz(15));
		fizzBuzz();
		
	}
	
	public static void fizzBuzz() {
		for (int i = 0; i <= 100; i ++) {
			if ((i % 3) == 0) System.out.println("Fizz"); 
			if ((i % 5) == 0) System.out.println("Buzz");
			if ((i % 3) == 0 && (i % 5) == 0) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println("" + i + "");
			}
		}
		
	}

}

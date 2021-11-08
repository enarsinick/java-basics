package com.qa.qacommunity;

public class HelloWorld {

	public static void main(String[] args) {
	
		System.out.println(addNums(1, 3));
		System.out.println(multiNums(4, 7));
		System.out.println(subNums(3, 1));
		System.out.println(divideNums(7, 3));

	}
	
	public static int addNums(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int multiNums(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int subNums(int num1, int num2) {
		return num1 - num2;
	}
	
	public static double divideNums(double num1, double num2) {
		return num1 / num2;
	}

}

package com.qa.qacommunity;

public class CaculatorRevisited {

	public static void main(String[] args) {

		System.out.println(addNums(1, 3));
		System.out.println(multiNums(4, 7));
		System.out.println(subNums(3, 1));
		System.out.println(divideNums(79, 70));

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

	public static double divideNums(int num1, int num2) {
		if (num1 < num2) {
			return num1 / num2;
		}
		System.out.println("Division cannot be performed");
		return 0.0;
	}
}

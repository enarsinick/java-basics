package com.qa.qacommunity;

public class Factorial {

	public static void main(String[] args) {

		FactorialNum example = new FactorialNum(5);
		example.calculateFactorial();
	}
}

class FactorialNum {
	
	public int num;
	
	public FactorialNum(int num) {
		this.num = num;
	}
	
	public void calculateFactorial() {
		int sum = 1;
		for (int i = num - 1; i >= 1; i--) {
			sum = sum * i;
		}
		System.out.println("Factorial of "+ num +" is: "+ sum);    
	}
}

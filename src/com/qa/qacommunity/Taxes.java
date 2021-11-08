package com.qa.qacommunity;

public class Taxes {

	public static void main(String[] args) {

		System.out.println(returnCalculatedTax(18999));
	}
	
	public static double taxBrackets(int salary) {
		if (salary < 14999) {
			return 0;
		} else if (salary < 19999) {
			return 0.10;
		} else if (salary < 29999) {
			return 0.15;
		} else if (salary < 44999) {
			return 0.20;
		} else {
			return 0.25;
		}
	} 
	
	public static double returnCalculatedTax(int salary) {
		double taxBracket = taxBrackets(salary);
		return salary * taxBracket;
	}
	
	

}

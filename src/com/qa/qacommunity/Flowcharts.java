package com.qa.qacommunity;

public class Flowcharts {

	public static void main(String[] args) {

		System.out.println(flowchart(3, 6, false));
		System.out.println(flowchart(3, 6, true));
	}
	
	public static int flowchart(int num1, int num2, boolean bool) {
		return bool ? num1 + num2 : num1 * num2;
	}

}

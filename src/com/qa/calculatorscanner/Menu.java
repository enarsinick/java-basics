package com.qa.calculatorscanner;

import java.util.Scanner;

public class Menu {
	
	Scanner input = new Scanner(System.in);
	boolean isRunning = true;
	int menuChoice;
	int num1;
	int num2;
	int total;
	
	public void start() {
		
		System.out.println("Welcome to the calculator app");
		
		while (isRunning) {
			System.out.println("=".repeat(40));
			System.out.println("Please select an option from the menu below:");
			System.out.println("=".repeat(40));
			System.out.println("1) Addition");
			System.out.println("2) Multiplication");
			System.out.println("3) Subtraction");
			System.out.println("4) Division");
			System.out.println("=".repeat(40));
			System.out.println("0) Exit");
			
			menuChoice = input.nextInt();
			
			switch (menuChoice) {
				case 1:
					System.out.println("ADDITION");
					getChoices();
					total = CalculatorScanner.addNums(num1, num2);
					System.out.println("Answer: " + total);
					break;
				case 2:
					System.out.println("MULTIPLICATION");
					getChoices();
					total = CalculatorScanner.multiNums(num1, num2);
					System.out.println("Answer: " + total);
					break;
				case 3:
					System.out.println("SUBTRACTION");
					getChoices();
					total = CalculatorScanner.subNums(num1, num2);
					System.out.println("Answer: " + total);
					break;
				case 4:
					System.out.println("DIVISION");
					getChoices();
					System.out.println("Answer: " + CalculatorScanner.divideNums(num1, num2));
					break;
				default:
					System.out.println("Program will exit");
					isRunning = false;
					break;
			}
		}
		
	}
	
	private void getChoices() {
		System.out.println("=".repeat(40));
		System.out.println("Please give your first number");
		num1 = input.nextInt();
		input.nextLine();
		System.out.println("Please give your second number");
		num2 = input.nextInt();
		input.nextLine();
	}

}

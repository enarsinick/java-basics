package com.qa.qacommunity;

public class BankAccount {
	
	private int balance;
	private int prevDeposit;
	private String name;
	private String bankName;
	
	
	
	public BankAccount(int balance, int prevDeposit, String name, String bankName) {
		this.balance = balance;
		this.prevDeposit = prevDeposit;
		this.name = name;
		this.bankName = bankName;
	}

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getPrevDeposit() {
		return prevDeposit;
	}
	
	public void setPrevDeposit(int prevDeposit) {
		this.prevDeposit = prevDeposit;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public static String staticMethod() {
		return "THis is a static method";
	}
	
	public int withdraw(int money) {
		return balance - money;
	}
	
	
	
}

package com.qa.qacommunity;

public class Runner {

	public static void main(String[] args) {

//		Person nick = new Person("Nick", 27, 6.3D, 12);
//		Person bob = new Person(56, 5.10D);
//		Person lottie = new Person("Lottie", 26, 5.8D, 6);
//		Person Phil = new Person(35, 5.11D);
//		
//		nick.greeting();
//		bob.tellAge();
//		lottie.tellAge();
		
		BankAccount account = new BankAccount(2000, 10, "Nick", "Lloyds");
		account.setBankName("TSB");
		System.out.println(account.getBankName());
		BankAccount.staticMethod();
		account.staticMethod();
		System.out.println(account.withdraw(20));
		
	
	}
	
	

}

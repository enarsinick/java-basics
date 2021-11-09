package com.qa.qacommunity;

public class Person {

	private String name;
	private int age;
	private double height;
	private int shoeSize;
	
	public Person(String name, int age, double height, int shoeSize) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.shoeSize = shoeSize;
	}
	
	
	
	public Person(int age, double height) {
		this.age = age;
		this.height = height;
	}



	public void greeting() {
		System.out.println("Hello! My name is " + name + ".");
	}
	
	public void tellAge() {
		System.out.println("I am currently " + age + " years old.");
	}
	
}

package com.qa.animal;

public class Animal implements Moveable, Killable {

	private String species;
	private String breed;
	private int age;

	public void makeNoise() {
		System.out.println("I am an animal making a noise");
	}

	public void eating() {
		System.out.println("I am an animal that is eating");
	}

	@Override
	public void dead() {
		System.out.println("The animal is now dead");
	}

	@Override
	public void moving() {
		System.out.println("I am moving");
	}

}

package com.qa.abstraction;

public class Ford extends Car {

	@Override
	public void noise() {
		System.out.println("VROOOOOOOOOOMMMMMMMMMM");

	}

	@Override
	public void numOfDoors() {
		System.out.println("5");
	}

}

package com.qa.interfaces;

public class Bike implements Colour, Engine {

	@Override
	public void engineType() {
		System.out.println("Petrol");
	}

	@Override
	public void engineSize() {
		System.out.println("1000cc");
	}

	@Override
	public void horsepower() {
		System.out.println("1000bhp");
	}

	@Override
	public void paintColour() {
		System.out.println("Red");
	}

	@Override
	public void appearance() {
		System.out.println("Matte");
	}
}

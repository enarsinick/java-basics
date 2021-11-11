package com.qa.interfaces;

public class Car implements Engine, Wheel {

	@Override
	public void numberOfWheels() {
		System.out.println("5");
	}

	@Override
	public void treadDepth() {
		System.out.println("10mm");
	}

	@Override
	public void drivetrain() {
		System.out.println("AWD");
	}

	@Override
	public void engineType() {
		System.out.println("Diesel");
	}

	@Override
	public void engineSize() {
		System.out.println("2.5");
	}

	@Override
	public void horsepower() {
		System.out.println("450bhp");
	}

}

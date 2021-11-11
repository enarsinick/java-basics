package com.qa.interfaces;

public class Runner {

	public static void main(String[] args) {

		Car car = new Car();
		Bike bike = new Bike();

		bike.appearance();
		bike.engineType();
		bike.horsepower();

		car.drivetrain();
		car.engineType();
		car.numberOfWheels();

	}

}

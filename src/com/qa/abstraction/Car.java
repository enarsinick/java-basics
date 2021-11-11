package com.qa.abstraction;

public abstract class Car {

	public abstract void noise();

	public abstract void numOfDoors();

	public void moving() {
		System.out.println("I am a car that moves");
	}

	public void braking() {
		System.out.println("I am slowing down");
	}

}

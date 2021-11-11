package com.qa.interandabstr;

public class Player extends Movement implements Health, Weapon {

	@Override
	public void moving() {
		System.out.println("Player is moving");
	}

	@Override
	public void shoot() {
		System.out.println("Firing gun...");
	}

	@Override
	public void reload() {
		System.out.println("Currently reloading...");

	}

	@Override
	public void loseHealth() {
		System.out.println("You're hit, lost -10 health!");

	}

	@Override
	public void refillHealth() {
		System.out.println("You've refilled your health.");

	}

	@Override
	public void dead() {
		System.out.println("You're dead, game over!");
	}

}

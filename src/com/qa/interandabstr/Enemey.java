package com.qa.interandabstr;

public class Enemey implements Health, Weapon {

	@Override
	public void shoot() {
		System.out.println("Enemey shoots a gun");
	}

	@Override
	public void reload() {
		System.out.println("Enemey is reloading...");

	}

	@Override
	public void loseHealth() {
		System.out.println("Enemey is hit, lost -10 health!");

	}

	@Override
	public void refillHealth() {
		System.out.println("Enemey has refilled health");

	}

	@Override
	public void dead() {
		System.out.println("Enemy is dead.");
	}

}

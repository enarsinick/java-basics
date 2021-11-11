package com.qa.interandabstr;

public class Runner {

	public static void main(String[] args) {

		Player player = new Player();
		Enemey enemey = new Enemey();

		player.moving();
		enemey.shoot();
		player.loseHealth();
		player.shoot();
		player.shoot();
		player.moving();
		enemey.loseHealth();
		player.shoot();
		enemey.loseHealth();
		enemey.dead();

	}

}

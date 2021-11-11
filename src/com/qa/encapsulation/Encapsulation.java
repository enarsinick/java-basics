package com.qa.encapsulation;

public class Encapsulation {
	
	private String name;
	private int age;
	private double height;
	private float weight;
	private long bankBalance;
	
	public Encapsulation() {
	}

	public Encapsulation(String name, int age, double height, float weight, long bankBalance) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.bankBalance = bankBalance;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public long getBankBalance() {
		return bankBalance;
	}
	
	public void setBankBalance(long bankBalance) {
		this.bankBalance = bankBalance;
	}

	@Override
	public String toString() {
		return "Encapsulation [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight
				+ ", bankBalance=" + bankBalance + "]";
	}
}

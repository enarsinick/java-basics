package com.qa.polymorphism;

public class Runner {

	public static void main(String[] args) {

		Object dog1 = new Dog();
		Animal dog2 = new Dog();
		Dog dog3 = new Dog();
		
		System.out.println("==========DOG CLASS===========");
		dog3.move();
		dog3.makeNoise();
		dog3.eat();
		dog3.wagTail();
		
		System.out.println("==========ANIMAL CLASS===========");
		dog2.move();
		dog2.eat();
		((Dog) dog2).makeNoise();
		((Dog) dog2).wagTail();
		
		System.out.println("==========OBJECT CLASS===========");
		((Animal) dog1).move();
		((Animal) dog1).eat();
		((Dog) dog1).makeNoise();
		((Dog) dog1).wagTail();
	}

}

package com.qa.encapsulation;

public class Runner {

	public static void main(String[] args) {
		
		Encapsulation example = new Encapsulation();
		
		example.setAge(27);
		example.setBankBalance(2131414323);
		example.setHeight(6.03D);
		example.setWeight(12.00F);
		example.setName("Nick");
		
		System.out.println(example.getName());
		System.out.println(example.getAge());
		System.out.println(example.getHeight());
		System.out.println(example.getWeight());
		System.out.println("£" + example.getBankBalance());
		
		System.out.println(example);

	}

}

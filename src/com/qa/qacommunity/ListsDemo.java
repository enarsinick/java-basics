package com.qa.qacommunity;

import java.util.*;

public class ListsDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		
		names.add("Nick");
		names.add("Lottie");
		names.add("Alan");
		names.add("Karen");
		
		System.out.println(names);
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		for (String name : names) {
			System.out.println(name);
		}
		
		names.set(1, "John");
		names.set(2, "Phil");
		
		System.out.println(names);
		
		names.remove(0);
		
		System.out.println(names);
		
	}

}

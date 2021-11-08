package com.qa.qacommunity;

public class EnhancedForLopps {

	public static void main(String[] args) {

//		String[] names = {"Nick", "John", "Steve", "Blake", "Noah", "Harry"};
//		
//		for (String name : names) {
//			System.out.println(name);
//		}
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
//		for (int num : nums) {
//			System.out.println(num * num);
//		}
		
		isEvenOdd(nums);
		
	}
	
	public static void isEvenOdd(int[] nums) {
		for (int num : nums) {
			if (num % 2 == 0) {
				System.out.println(num * num * num);
			} else {
				System.out.println(num * num);
			}
		}
	}

}

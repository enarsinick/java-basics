package com.qa.qacommunity;

public class ArraysDemo {

	public static void main(String[] args) {

		// Arrays
		int[] ageArray = {18, 26, 35, 11, 46, 98, 3};
		long[] ageArray2 = new long[6];
//		System.out.println(ageArray[1]);
//		arrayDemo2();
		
		int[][] ageArray3 = {{1, 67, 45}, {86, 73, 100}, {90, 13, 45}};
		
		for (int i = 0; i < ageArray3[0].length; i++) {
			for (int j = 0; j < ageArray3[1].length; j++) {
				System.out.println(ageArray3[i][j]);
			}
		}
		
	}
	
	public static void arrayDemo2() {
		int[] age = new int[10];
		
		for (int i = 0; i < 10; i++) {
			age[i] = i + 1;
			System.out.println(age[i]);
		}
		
		for (int i = 0; i < 10; i++) {
			age[i] = age[i] * 10;
			System.out.println(age[i]);
		}
	}
}

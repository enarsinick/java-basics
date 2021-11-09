package com.qa.qacommunity;

import java.util.Arrays;
import java.util.List;

public class FindMaximum {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(34,5,76,12,7,9,4,321,56,87,99,423,5,2,12100,7,86,4,7,8,98,8,4,43,2,2,34,2);
		System.out.println(findMax(list));
	}
	
	public static int findMax(List<Integer> list) {
		int biggestNum = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) > biggestNum) {
				biggestNum = list.get(i);
			}
		}
		return biggestNum;
	}

}

package com.qa.qacommunity;

import java.util.Arrays;
import java.util.List;

public class LinearSearch {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(34,5,76,12,7,9,4,321,56,87,99,423,5,2,121,7,86,4,7,8,98,8,4,43,2,2,34,2);
		System.out.println(search(9, list));
	}
	
	public static int search(int num, List<Integer> list) {
		int index = -1;
		for (int i = 1; i < list.size(); i++) {
			if (num == list.get(i)) {
				index = i;
			} 
		}
		return index;
	}

}

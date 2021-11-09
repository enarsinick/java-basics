package com.qa.qacommunity;

import java.util.*;

public class NthOddElement {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 ,15, 16, 17, 18, 19, 20, 21);
		System.out.println(findNthOddNumber(myList, 5));
		
	}
	
	public static int findNthOddNumber(List<Integer> list, int num) {
		int index = (2 * num) - 1;
		return index > list.size() ? -1 : list.get(index - 1);
	}

}

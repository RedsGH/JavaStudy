package com.learn.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.size());
		
		list.add("1");
		System.out.println(list.size());
		list.add("1");
		System.out.println(list.size());
		
		Integer[] a = {1,2,3,444,555,11,11,22,33,4,5,6,1,23,4,53,123,45,123,56,13};
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(a));
		
	}
	
}

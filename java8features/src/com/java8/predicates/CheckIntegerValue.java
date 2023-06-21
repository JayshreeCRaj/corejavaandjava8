package com.java8.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CheckIntegerValue {
	
	public static Boolean checkNumber(int num) {
		return num == 2023;
	}
	
	public static void main(String []args) {
		System.out.println(checkNumber(2021));
		
		//Using predicate
		Predicate<Integer> pd = (num) -> num == 2023;
		System.out.println(pd.test(2023));
		
		//To check length of a given string is greater than 5
		Predicate<String> pd1 = (str) -> str.length() > 5;
		System.out.println(pd1.test("Content"));
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(35);
		list.add(28);
		list.add(49);
		list.add(6);
		
		Predicate<Integer> pd2 = (num) -> num > 10;
		for(Integer i:list) {
			if(pd2.test(i)) {
				System.out.println(i);
			}
		}
	}

}

package com.java8.suppliers;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumber {

	public static void main(String[] args) {
		
		Supplier<String> s = () -> "Data";
		System.out.println(s.get());
		
		Supplier<Integer> si = () -> new Random().nextInt(2500);
		for(int i=0; i<15; i++) {
			System.out.println(si.get());
		}

	}

}

package com.java8.suppliers;

import java.util.Date;
import java.util.function.Supplier;

public class RandomDate {

	public static void main(String[] args) {
		Supplier<Date> sd = () -> new Date();
		System.out.println(sd.get());

	}

}

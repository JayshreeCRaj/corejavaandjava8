package com.java8.dateandtime;

import java.time.LocalDateTime;
import java.time.Month;

public class CustomDateTime {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.of(1994, Month.MARCH, 15, 04, 20);
		System.out.println(ldt);
	}

}

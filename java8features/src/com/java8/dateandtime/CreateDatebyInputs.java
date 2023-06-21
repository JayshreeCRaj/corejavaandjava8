package com.java8.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class CreateDatebyInputs {

	public static void main(String[] args) {
		
		
		LocalDateTime ldt = LocalDateTime.of(1990, 9, 19, 9, 29);
		System.out.println(ldt);
		
		LocalDate firstDay_2023 = LocalDate.of(2023, Month.JANUARY, 1);
		System.out.println("Specific Date="+firstDay_2023);
		
		LocalDate day100Of2023 = LocalDate.ofYearDay(2023, 100);
		System.out.println("100th day of 2023="+day100Of2023);
	}

}

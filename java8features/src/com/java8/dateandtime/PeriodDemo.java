package com.java8.dateandtime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		
		//LocalDate date = LocalDate.of(1994, 8, 05);
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1995, 4, 23);
		Period p =Period.between(birthday,today);
		System.out.printf("Difference of period is: %d years %d months and %d days", p.getYears(),p.getMonths(), p.getDays());
	}

}

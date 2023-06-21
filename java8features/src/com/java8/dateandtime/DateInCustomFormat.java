package com.java8.dateandtime;

import java.time.LocalDate;

public class DateInCustomFormat {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		
		System.out.println(dd+"-"+mm+"-"+yy);
		
		System.out.printf("\n%d/%d/%d", dd, mm, yy);
	}

}

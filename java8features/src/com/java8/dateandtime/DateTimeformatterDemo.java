package com.java8.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeformatterDemo {

	public static void main(String[] args) {
		
		String dateInString = "Wed, Jun 07 2023";
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern("EEE, MMM dd yyyy", Locale.ENGLISH);
		LocalDate dateTime = LocalDate.parse(dateInString, formatter);
		System.out.println(dateTime);
	}

}

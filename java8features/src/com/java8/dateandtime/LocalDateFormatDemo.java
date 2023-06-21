package com.java8.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateFormatDemo {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("Default Format of LocalDate: "+date);
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MMM/uuuu")));
		
	}

}

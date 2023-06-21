package com.java8.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeFormatterDemo {

	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Default format LocalDateTime: "+ dateTime);
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd/MMM/uuuu HH::mm::ss")));
	}

}

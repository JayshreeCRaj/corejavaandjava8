package com.java8.dateandtime;

import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getTime());
		System.out.println(Calendar.getAvailableCalendarTypes());
	}

}

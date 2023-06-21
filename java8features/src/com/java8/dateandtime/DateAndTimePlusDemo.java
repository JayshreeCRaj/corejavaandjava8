package com.java8.dateandtime;

import java.time.LocalDateTime;

public class DateAndTimePlusDemo {

	public static void main(String[] args) {
		
		LocalDateTime dtl = LocalDateTime.of(1990, 9, 19, 9, 29);
		System.out.println(dtl);
		System.out.println("After Six Months:"+dtl.plusMonths(6));
		System.out.println("Before Six Months:"+dtl.minusMonths(6));
	}

}

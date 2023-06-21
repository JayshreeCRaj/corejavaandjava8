package com.java8.dateandtime;

import java.time.Instant;

public class InstantDemo {

	public static void main(String[] args) {
		
		Instant timestamp = Instant.now();
		System.out.println("Current Timestamp in UTC:"+timestamp);
		
		System.out.println(timestamp.toEpochMilli());
		
		Instant specificTime= Instant.ofEpochMilli(timestamp.toEpochMilli());
		System.out.println("Specific Time="+specificTime);
	}

}

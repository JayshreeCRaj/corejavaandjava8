package com.java8.dateandtime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIDDemo {

	public static void main(String[] args) {
		
		ZoneId zid = ZoneId.of("Z");
		ZonedDateTime zt = ZonedDateTime.now(zid);
		
		System.out.println(zt);
	}

}

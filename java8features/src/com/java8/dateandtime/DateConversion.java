package com.java8.dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateConversion {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		
		String dateInString = "07-Jun-2023";
		Date date = formatter.parse(dateInString);
		System.out.println(date);
		Locale[] loc= SimpleDateFormat.getAvailableLocales();
		for(Locale l :loc)
		System.out.println(l);
		System.out.println(formatter.get2DigitYearStart());
	}

}

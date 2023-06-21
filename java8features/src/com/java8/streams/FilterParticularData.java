package com.java8.streams;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
//Filter details of customer Ramesh
public class FilterParticularData {

	public static void main(String[] args) {
		
		List<HDFCBank> list = new ArrayList<>();
		list.add(new HDFCBank("Ramesh", 234562, 1000));
		list.add(new HDFCBank("Arjun", 567890, 3000));
		list.add(new HDFCBank("Rakshith", 123456, 2000));
		list.add(new HDFCBank("Bhanu", 981267, 5000));
		list.add(new HDFCBank("Kiran", 349845, 10000));
		
		HDFCBank bank = list.stream().
				filter(str -> str.getCustomerName().equals("Ramesh")).
				findAny().orElse(null);
		System.out.println(bank);
		
		//Find the names of customer whose names start with R
		List<String> result = list.stream().
				filter(str -> str.getCustomerName().startsWith("R")).map(HDFCBank::getCustomerName).collect(Collectors.toList());
		System.out.println(result);
		
		//Filter customer details whose name is arjun and account number is 567890
		HDFCBank bank1 = list.stream().
								filter(b -> b.getCustomerName().equals("Arjun") & 
								b.getAccountNumber() == 567890).
								findAny().
								orElse(null);
		System.out.println(bank1);
		
		//Summerizing long, int double -> gives details of max, min, average count of the data
		
		IntSummaryStatistics ls = list.stream().
				collect(Collectors.summarizingInt(b->b.getBalance()));
		System.out.println(ls);
	}

}

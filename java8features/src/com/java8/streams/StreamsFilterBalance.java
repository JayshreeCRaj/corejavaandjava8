package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterBalance {

	public static void main(String[] args) {
		
		List<HDFCBank> list = new ArrayList<>();
		list.add(new HDFCBank("Bharati", 4256, 3000));
		list.add(new HDFCBank("Arati", 9563, 2000));
		list.add(new HDFCBank("Hari", 7456, 10000));
		list.add(new HDFCBank("Rahul", 5214, 7000));
		list.add(new HDFCBank("Pallavi", 3215, 4000));
		
		List<HDFCBank> result = list.stream().
		filter(bank -> bank.balance < 5000).
		collect(Collectors.toList());
		
		System.out.println(result);
		
		long resulti = list.stream().
				filter(bank -> bank.balance < 5000).count();
		//number of customers whose balance is less than 500	
		System.out.println(resulti);
	}

}

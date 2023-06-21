package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxandMinBalance {

	public static void main(String[] args) {
		
		List<HDFCBank> list = new ArrayList<>();
		list.add(new HDFCBank("Bharati", 4256, 3000));
		list.add(new HDFCBank("Arati", 9563, 2000));
		list.add(new HDFCBank("Hari", 7456, 10000));
		list.add(new HDFCBank("Rahul", 5214, 7000));
		list.add(new HDFCBank("Pallavi", 3215, 4000));
		
		HDFCBank bank = list.stream().max(Comparator.comparing(HDFCBank::getBalance)).get();
		System.out.println("Maximum balance");
		System.out.println(bank);
		
		HDFCBank hbank= list.stream().min(Comparator.comparing(HDFCBank::getBalance)).get();
		System.out.println("Minimum balance");
		System.out.println(hbank);
	}

}

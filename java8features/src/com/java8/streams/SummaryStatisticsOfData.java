package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class SummaryStatisticsOfData {

	public static void main(String[] args) {
		
		List<HDFCBank> list = new ArrayList<>();
		list.add(new HDFCBank("Bharati", 4256, 3000));
		list.add(new HDFCBank("Arati", 9563, 2000));
		list.add(new HDFCBank("Hari", 7456, 10000));
		list.add(new HDFCBank("Rahul", 5214, 7000));
		list.add(new HDFCBank("Pallavi", 3215, 4000));
	
		LongSummaryStatistics statistics = list.stream().
		collect(Collectors.summarizingLong(bank -> bank.getBalance()));
		System.out.println(statistics);
	}

}

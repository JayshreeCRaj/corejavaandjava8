package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetToMap {

	public static void main(String[] args) {
		
		List<HDFCBank> list = new ArrayList<>();
		list.add(new HDFCBank("Bharati", 4256, 3000));
		list.add(new HDFCBank("Arati", 9563, 2000));
		list.add(new HDFCBank("Hari", 7456, 10000));
		list.add(new HDFCBank("Rahul", 5214, 7000));
		list.add(new HDFCBank("Pallavi", 3215, 4000));

		Set<HDFCBank> setResult= list.stream().distinct().
		collect(Collectors.toSet());
		System.out.println(setResult);
		
		Map<Object, Object> mapResult= list.stream().distinct().
				collect(Collectors.toMap(bank->bank.getAccountNumber(),bank->bank.toString()));
				System.out.println(mapResult);
		mapResult.forEach((k, v)->System.out.println(k+"-"+v));
					
		}

}

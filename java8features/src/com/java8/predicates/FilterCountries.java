package com.java8.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterCountries {
	
	public static void main(String[] args) {
		List<Country> list = new ArrayList<>();
		list.add(new Country("Iran", 66588939));
		list.add(new Country("Poland", 123856679));
		list.add(new Country("Indonasia", 12345939));
		list.add(new Country("Sweden", 29815708));
		list.add(new Country("India", 876422939));
		list.add(new Country("Ireland", 49021345));
		list.add(new Country("Vietnam", 7756345));
		list.add(new Country("Singapore", 9267895));
		
		
		Predicate<Country> p = country -> country.getName().startsWith("I");
		
		for(Country c:list) {
			if(p.test(c)) {
				System.out.println(c);
			}
		}
	}

}

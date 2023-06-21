package com.java8.functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.java8.predicates.Country;

public class PrintNamesOnlyFromList {

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
		
		
		Function<Country, String> f = (names) -> names.getName();
		for(Country c:list) {
			if(f.apply(c) != null)
				System.out.println(f.apply(c));
		}
		
		//Sort names in ascending order
		Collections.sort(list, Comparator.comparing(f));
		System.out.println(list);
		//Sort population in ascending order
		Collections.sort(list, Comparator.comparing(country -> country.getPopulation()));
		System.out.println(list);
		//Using method reference, descending order
		Collections.sort(list, Comparator.comparing(Country::getPopulation).reversed());
		System.out.println(list);
	}

}

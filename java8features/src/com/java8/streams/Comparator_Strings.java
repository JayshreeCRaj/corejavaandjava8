package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparator_Strings {

	public static void main(String[] args) {
		List<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee("Alan", 20000));
		elist.add(new Employee("Mary", 30000));
		elist.add(new Employee("Jack", 45000));
		elist.add(new Employee("Dan", 56000));
		elist.add(new Employee("Blair", 18000));
		
		List<Employee> empResult= elist.stream().
		sorted(Comparator.comparing(Employee::getSalary)).
		collect(Collectors.toList());
		System.out.println("Ascending Order: "+empResult);
	
		List<Employee> empResultr= elist.stream().
				sorted(Comparator.comparing(Employee::getSalary).reversed()).
				collect(Collectors.toList());
				System.out.println("Descending Order: "+empResultr);
				
		//Use only for large number of data		
		long count = elist.parallelStream().filter(e->e.getSalary()>30000).count();	
		System.out.println(count);
	}

}

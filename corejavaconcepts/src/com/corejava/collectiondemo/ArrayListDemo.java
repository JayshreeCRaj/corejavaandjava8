package com.corejava.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Helper implements Comparator<Employee>{
	
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getSalary()-e2.getSalary();
	}
}

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Arjun", 56000));
		list.add(new Employee("Shruti", 34000));
		list.add(new Employee("Pavan", 29000));
		list.add(new Employee("Bharati", 32000));
		list.add(new Employee("Kiran", 42000));
		
		System.out.println(list);
		Collections.sort(list, new Helper());
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		//using streams
		List<Employee> result = list.stream().
				sorted(Comparator.comparing(Employee::getName)).
				collect(Collectors.toList());
		
		System.out.println(result);
	}

}

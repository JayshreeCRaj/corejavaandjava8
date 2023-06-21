package com.corejava.collectiondemo;

//import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private Integer salary;
	public Employee(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public Integer getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.name.compareTo(o.name);
	}
	
	/*
	 * @Override public int compareTo(Object obj) { Employee obj1 = (Employee)obj;
	 * return salary - obj1.salary; }
	 */
	
}


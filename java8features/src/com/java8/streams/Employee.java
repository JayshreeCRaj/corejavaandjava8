package com.java8.streams;

public class Employee {
	
	private String name;
	private Integer salary;
	public Employee(String name, Integer salary) {
		super();
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
	
	
	
}
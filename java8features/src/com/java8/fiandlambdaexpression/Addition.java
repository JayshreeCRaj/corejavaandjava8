package com.java8.fiandlambdaexpression;

interface IAddition{
	void add(int a, int b);
}
public class Addition {

	public static void main(String []args) {
		IAddition obj= (int a, int b) -> {
			System.out.println("value = "+(a+b));
		};
		obj.add(10,20);
		
		IAddition obj1= (a, b) -> {
			System.out.println("value = "+(a+b));
		};
		obj1.add(10,20);
		
		IAddition obj2= (a, b) -> System.out.println("value = "+(a+b));
		obj2.add(10,20);
	}
}

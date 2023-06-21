package com.corejava.exceptions;

public class NestedTryCatchDemo {

	public static void main(String[] args) {
		
		try {
			System.out.println("Outer try block");
			try {
				System.out.println("Inner try block");
				System.out.println(10/0);
			}
			catch(NullPointerException ex) {
				System.out.println("Inner catch");
			}
			/*catch(ArithmeticException ex) {
				System.out.println("Inner catch block");
			}*/
			System.out.println("After inner try");
		}
		catch(ArithmeticException ex) {//executes if inner catch doesn't match actual exception raised
			System.out.println("Outer catch block");
		}
		System.out.println("After outer try");
	}

}

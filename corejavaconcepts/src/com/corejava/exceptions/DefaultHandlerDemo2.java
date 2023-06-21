package com.corejava.exceptions;

public class DefaultHandlerDemo2 {
	
	@SuppressWarnings("finally")
	static int test() {
		try {
			System.out.println("In try");
			return 10; //Stored in Java default handler
			
		}catch(ArithmeticException ae) {
			System.out.println("In catch");
			return 20;
		}
		finally {
			System.out.println("In finally");
			//return 30; // stored value is updated by Java default handler
		}
	}
	
	@SuppressWarnings("finally")
	static int test1() {
		try {
			System.out.println("In try");
			System.out.println(10/0); // Java default handler AE->30
			
		}catch(ArithmeticException ae) {
			System.out.println("In catch");
			return 20;
		}
		finally {
			System.out.println("In finally");
			return 30; // stored value is updated by Java default handler
		}
	}
	
	@SuppressWarnings("finally")
	static void test2() {
		try {
			System.out.println("In try");
			System.out.println(10/0); 
			
		}catch(NullPointerException ne) {
			System.out.println("In catch");//if doesnt match the actual exception raised, this code doesn't execute with empty return statement
		}//normal execution flow is ensured
		/*
		 * catch(ArithmeticException ae) { System.out.println("In catch"); } //Executes with empty return statement and normal execution flow is achieved.
		 */
		finally {
			System.out.println("In finally");
			return ; //Even if exception is raised, to maintain the normal execution flow, we can use empty return
		}
	}
	
	@SuppressWarnings("finally")
	static int test3() {
		try {
			System.out.println("In try");
			System.out.println(10/0); // Java default handler AE->30
			
		}catch(ArithmeticException ae) {
			System.out.println("In catch");
		}
		finally {
			System.out.println("In finally");
		}
		return 30;
		
	}

	public static void main(String[] args) {
		
		System.out.println(test());
		System.out.println("______________");
		System.out.println(test1());
		System.out.println("______________");
		test2();
		System.out.println("______________");
		System.out.println(test3());
	}

}

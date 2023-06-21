package com.corejava.exceptions;

public class InstanceofDemo {
	
	public static void test() {
		
		String str = null;
		int num = 10;
		int[] numArray = {0,1,2,3,4,5,6};
		try {
			//
			System.out.println("Try block 1");
			//num = num/0;
			System.out.println(numArray[8]);
			System.out.println(str.length());
		}
		// instanceof to specify different actions for
		// different exceptions using only one catch block
		catch(Exception e){
			if(e instanceof ArithmeticException)
				System.out.println("Can't divide by 0");
			if(e instanceof ArrayIndexOutOfBoundsException)
				System.out.println("This index doesn't exist in this array");
			if(e instanceof NullPointerException)
				System.out.println("Can't get length of object pointing to null");
		}
	}

	public static void main(String[] args) {

		test();
	}

}

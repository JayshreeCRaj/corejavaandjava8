package com.corejava.exceptions;

public class ThrowAndThrowsDemo {
	
	public static void checkNum(int num) {
		if(num<=0) {
			throw new ArithmeticException("\n Number is negative, cannot calculate square");
		}
		else {
			System.out.println("Square of " +num+" is "+(num*num));
		}
	}
	
	public static int divideNum(int m, int n) throws ArithmeticException{
		int div = m/n;
		return div;
	}

	public static void main(String[] args) {
		//ThrowAndThrowsDemo.checkNum(-3);
		ThrowAndThrowsDemo.divideNum(45, 0);
	}

}

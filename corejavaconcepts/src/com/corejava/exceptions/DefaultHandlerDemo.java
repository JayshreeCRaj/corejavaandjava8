package com.corejava.exceptions;

public class DefaultHandlerDemo {

	public static void main(String[] args) {
		
		try {
			System.out.println("1");
			int x = 25/0; //Java default handler handles exception if there is no catch defined for that exception
			System.out.println("2");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("3");
		}
		System.out.println("4");
	}

}

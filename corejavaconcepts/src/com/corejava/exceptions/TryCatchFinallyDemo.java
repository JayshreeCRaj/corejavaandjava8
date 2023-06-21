package com.corejava.exceptions;

public class TryCatchFinallyDemo {
	
	public static void test() {
		
		String str = null;
		int num = 10;
		int[] numArray = {0,1,2,3,4,5,6};
		try {
			//num = num/0;
			System.out.println("Try block 1");
			
			//System.out.println(numArray[8]);
			
			System.out.println(str.length());
		}
		catch(ArithmeticException ae){
			System.out.println("Catch 1 - num devided by 0 is undefined");
			ae.getClass();
		}
		catch(ArrayIndexOutOfBoundsException iob) {
			System.out.println("Catch 2");
			iob.printStackTrace();
		}
		catch(NullPointerException ne) {
			System.out.println("Catch 3");
			System.out.println(ne.getClass());
			System.out.println(ne.getMessage());
			//System.out.println(ne.getLocalizedMessage());
		}
		finally {
			System.out.println("finally block");
		}		
		
	}

	public static void main(String[] args) {
		
		test();
		
	}

}

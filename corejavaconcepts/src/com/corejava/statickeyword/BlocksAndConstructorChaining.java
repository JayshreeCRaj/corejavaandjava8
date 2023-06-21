package com.corejava.statickeyword;

public class BlocksAndConstructorChaining {
	
	int number;
	BlocksAndConstructorChaining(){
		System.out.println("Default Constructor");
	}
	static{
		System.out.println("Static Block 1");
	}
	{
		number = 100;
		System.out.println("Instance Block 1:number= "+number);
	}
	BlocksAndConstructorChaining(int i){
		this();
		number = i;
		System.out.println("Parameterized Constructor (int)");
	}
	{
		number = number+1;
		System.out.println("Instance Block 2:number= " +number);
	}
	BlocksAndConstructorChaining(int i, int j){
		this();
		number = i+j;
		System.out.println("Parameterised Constructor (int, int) ");
		
	}
	static {
		System.out.println("Static Block 2");
	}
	public static void main(String[] args) {
		BlocksAndConstructorChaining b = new BlocksAndConstructorChaining();
		System.out.println("________________");
		BlocksAndConstructorChaining b1 = new BlocksAndConstructorChaining(200);
		System.out.println("________________");
		BlocksAndConstructorChaining b2 = new BlocksAndConstructorChaining(100, 200);
		System.out.println("________________");
	}

}

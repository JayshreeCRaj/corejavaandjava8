package com.java8.consumers;

import java.util.function.Consumer;

public class ConsumeData {

	public static void main(String[] args) {
		
		Consumer<String> cs = (s) -> System.out.println(s);
		cs.accept("Some");
		cs.accept("content");
		cs.accept("is");
		cs.accept("displayed");
	
	}
	

}

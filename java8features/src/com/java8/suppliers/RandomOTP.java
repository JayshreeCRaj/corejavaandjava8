package com.java8.suppliers;

import java.util.Random;
import java.util.function.Supplier;

public class RandomOTP {

	public static void main(String[] args) {
		
		Supplier<String> ss = () -> {
			String otp = "RN-";
			for(int i=0; i<6; i++) {
				otp = otp + new Random().nextInt(8);
			}
			return otp;
		};
		for(int i=0; i<6; i++) {
			System.out.println(ss.get());
		}
	}

}

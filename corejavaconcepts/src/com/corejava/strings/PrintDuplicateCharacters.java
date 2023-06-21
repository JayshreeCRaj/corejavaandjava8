package com.corejava.strings;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String sentence = sc.next();
		ArrayList<Character> list = new ArrayList<Character>();
		int count=0;
		for(int i=0; i<sentence.length(); i++) {
			char ch = sentence.charAt(i);
			for(int j=0; j<sentence.length(); j++) {
				if(sentence.charAt(j) != ch) {
					continue;
				}
				count++;
			}
			if(!list.contains(ch)) {
				if(ch != ' ' && count>1)
					list.add(ch);
			}
			count=0;
		}
		if(list.isEmpty()) {
			System.out.println("No Duplicates");
		}
		//list=(ArrayList<Character>) list.stream().distinct().collect(Collectors.toList());
		else{
			System.out.println("Duplicate characters are:");
			for(Character c : list) {
				System.out.println(c);
			}
		}
		
	}

}

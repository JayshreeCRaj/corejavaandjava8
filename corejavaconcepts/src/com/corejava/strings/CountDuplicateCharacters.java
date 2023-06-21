package com.corejava.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountDuplicateCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String sentence = sc.next();
		int count = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<sentence.length(); i++) {
			char ch = sentence.charAt(i);
			for(int j=0; j<sentence.length(); j++) {
				if(sentence.charAt(j) != ch) {
					continue;
				}
				count++;
			}
			if(ch != ' ' && count>1)
				map.put(ch, count);
			count=0;
		}
		if(map.isEmpty()) {
			System.out.println("No Duplicates");
		}
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			System.out.println("Duplicate Character: "+entry.getKey()+"\nCount: "+entry.getValue());
		}
	}

}

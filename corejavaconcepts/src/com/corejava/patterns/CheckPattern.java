package com.corejava.patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CheckPattern {
	
	public static boolean check(String str, Pattern pattern) {
		Matcher m = pattern.matcher(str);
		Boolean b = m.find();
		return b;
	}

}

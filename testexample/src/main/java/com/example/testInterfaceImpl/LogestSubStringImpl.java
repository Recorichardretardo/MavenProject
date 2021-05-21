package com.example.testInterfaceImpl;

import java.util.HashSet;
import java.util.Set;

import com.example.testInterface.LogestSubString;

public class LogestSubStringImpl implements LogestSubString {

	@Override
	public String longest(String str) {
		Set<Character> set = new HashSet<Character>();
		String longestOverall = "", longestTillNow = "";
		for(char c : str.toCharArray()) {
			if(set.contains(c)) {
				longestTillNow = "";
				set.clear();
			}
			longestTillNow +=c;
			set.add(c);
			if(longestTillNow.length() > longestOverall.length()) {
				longestOverall = longestTillNow;
			}
		}
		return longestOverall;
	}

}

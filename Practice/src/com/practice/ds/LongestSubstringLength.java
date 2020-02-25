package com.practice.ds;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class LongestSubstringLength {
	public static int lengthOfLongestSubstring(String s) {

		int max = 0;

		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			Set<Character> temp = new HashSet<>();
			for (int j = i; j < s.length(); j++) {
				if (!temp.contains(s.charAt(j))) {
					count++;
					temp.add(s.charAt(j));
					continue;
				} else
					break;
			}
			if (count > max)
				max = count;
		}
		
		HashMap<Integer,Integer> temp = new HashMap<>();
		temp.put(1,1888);
		temp.put(2,9866);
		temp.put(4,986);
		
		System.out.println(temp);
		
		return max;
	}

	public static void main(String[] args) {

		String input = "pwwkew";

		int result = lengthOfLongestSubstring(input);
		System.out.println(result);

	}
}
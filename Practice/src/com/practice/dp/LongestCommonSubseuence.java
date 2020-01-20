package com.practice.dp;

import java.util.HashMap;
import java.util.Map;

// Given two strings, find the length of the longest Common subsequence from both of them
// This is a memoized approach to the problem
public class LongestCommonSubseuence {

	static Map<String, Integer> map = new HashMap<>();
	static int lcs(char[] a, char[] b, int m, int n) {

		int result;
		if (map.containsKey(m + "," + n))
			map.get(m + "," + n);

		if (m < 0 || n < 0)
			return 0;
		if (a[m] == b[n])
			result = 1 + lcs(a, b, m - 1, n - 1);
		else
			result = Math.max(lcs(a, b, m, n - 1), lcs(a, b, m - 1, n));

		map.put(m + "," + n, result);
		return result;
	}

	public static void main(String[] args) {

		String a = "abcgg";
		String b = "abgggg";

		int length = lcs(a.toCharArray(), b.toCharArray(), a.length() - 1, b.length() - 1);
		System.out.println("Length of longest common subsequence is : " + length);
	}
}

package com.practice.dp;

import java.util.HashMap;
import java.util.Map;

// Given a set of positive integers and a sum s, is there a subset which adds up to s
// This is a memoized approach to the problem
public class SumSubsetMemoized {

	static Map<String, Boolean> map = new HashMap<>();

	static boolean isSumSubset(int[] set, int n, int sum) {

		if (map.containsKey(n + "," + sum))
			return map.get(n + "," + sum);
		if (sum == 0)
			return true;
		if (n < 0 && sum != 0)
			return false;

		boolean truthValue = isSumSubset(set, n - 1, sum - set[n]) || isSumSubset(set, n - 1, sum);

		map.put(n + "," + sum, truthValue);

		return truthValue;

	}

	public static void main(String[] srgs) {
		int[] a = { 2, 4, 5, 3 };
		int sum = 10;

		boolean truthValue = isSumSubset(a, a.length - 1, sum);

		System.out.println("Is there a subset which adds up to sum : " + truthValue);

	}
}

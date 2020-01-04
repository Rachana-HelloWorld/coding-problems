package com.oops.practice;

public class FiboBottomUp {

	public static void main(String[] args) {

		int n = 50;
		long result = fibo(n);
		System.out.println(result);
	}

	static long fibo(int n) {

		long[] memo = new long[n + 1];
		memo[1] = 1;
		memo[2] = 1;

		for (int i = 3; i <= n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}
		return memo[n];
	}
}

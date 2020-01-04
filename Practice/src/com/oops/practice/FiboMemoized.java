package com.oops.practice;

// Program to find the nth fibonacci number using Memoized solution
public class FiboMemoized {

	public static void main(String[] args) {

		int n = 50;
		long[] memo = new long[n + 1];

		for (int i = 0; i <= n; i++)
			memo[i] = -1;

		// although the data type is long, it may overflow at one point if n is large
		long result = fibo(n, memo);
		System.out.println(result);
	}

	static long fibo(int n, long[] memo) {
		
		long result;
		if (memo[n] != -1)
			return memo[n];
		if (n == 1 || n == 2)
			result = 1;
		else
			result = fibo(n - 1, memo) + fibo(n - 2, memo);
		memo[n] = result;
		return result;
	}
}

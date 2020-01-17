package com.practice.ds;

public class FiboIterative {

	// Program to print first n fibonacci numbers
	public static void main(String[] args) {

		int n = 100; // take user unput
		if (n == 0)
			System.out.println("Please enter a number greater than 0");
		fibo(n);

	}

	// prints the first n fibonacci series
	public static void fibo(int n) {

		int a = 0, b = 1, c;
		for (int i = 0; i < n; i++) {
			c = a;
			a = b;
			b = c + b;
			System.out.println(c);
		}

	}

}

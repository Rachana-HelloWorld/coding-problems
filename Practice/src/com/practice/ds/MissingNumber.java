package com.practice.ds;

public class MissingNumber {

//	You are given a list of n-1 integers and these integers are in the range of 1 to n. 
//	There are no duplicates in the list. One of the integers is missing in the list. 
//	Write an efficient code to find the missing integer.

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 5 };
		System.out.println(missingNumber(a));

	}

	static int missingNumber(int[] arr) {

		int n = arr.length;
		int total = (n + 1) * (n + 2) / 2;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return (total - sum);
	}
}

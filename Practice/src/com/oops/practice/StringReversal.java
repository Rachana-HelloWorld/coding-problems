package com.oops.practice;

public class StringReversal {

	public static void main(String[] args) {

		String str = "world";
		char[] arr = str.toCharArray();

		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			char temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;

		}

		System.out.println(new String(arr));

	}

}

package com.oops.practice;

public class WordReversal {

	public static void main(String[] args) {

		String sent = "hello beautiful world";
		String[] str = sent.split(" ");

		System.out.println(sent);

		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}

	}

}

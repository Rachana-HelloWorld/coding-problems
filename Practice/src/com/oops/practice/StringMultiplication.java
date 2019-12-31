package com.oops.practice;

public class StringMultiplication {

	public static void main(String[] args) {

		String num1 = "5";
		String num2 = "12";

		String result = multiply(num1, num2);
		System.out.println(result);

	}

	public static String multiply(String num1, String num2) {

		int[] prod = new int[num1.length() + num2.length()];

		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}

		int q = num1.length() + num2.length() - 1;
		int p;

		for (int i = num1.length() - 1; i >= 0; i--) {
			p = q;
			int carry = 0;
			int carry1 = 0;
			for (int j = num2.length() - 1; j >= 0; j--) {
				int product = Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j))
						+ carry;

				int sum = product % 10;
				int a = (prod[p] + sum);
				prod[p] = (a + carry1) % 10;
				carry1 = (a + carry1) / 10;
				p--;
				carry = product / 10;
			}

			if (carry != 0 || carry1 != 0)
				prod[p] = carry + carry1;

			q--; 
		}

		int count = 0;
		for (int i = 0;; i++) { 
			if (prod[i] == 0)
				count++;
			else
				break;
		}

		StringBuilder sb = new StringBuilder();

		for (int k = 0; k < prod.length; k++) {
			sb.append(Integer.toString(prod[k]));
		}

		return new String(sb.substring(count));
	}
}

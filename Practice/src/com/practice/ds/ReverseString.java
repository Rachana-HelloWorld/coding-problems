package com.practice.ds;

class ReverseString {
	public String reverseStr(String s, int k) {

		StringBuffer sb = new StringBuffer(s);
		int length = sb.length();
		StringBuffer newString = new StringBuffer("");
		StringBuffer r = new StringBuffer("");

		int i = 0, j = 2 * k;

		while (i < length) {

			if ((i + k) >= length) {
				newString = newString.append(reverse(sb.substring(i, length)));
				break;
			}

			r = reverse(sb.substring(i, i + k));

			if (j >= length) {
				newString = newString.append(r).append(sb.substring(i + k, length));
				break;

			}

			else {
				newString = newString.append(r).append(sb.substring(i + k, j));
			}

			i = j;
			j = 2 * k + j;
		}

		return new String(newString);

	}

	public StringBuffer reverse(String s) {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse();
	}

	public static void main(String[] args) {

		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseStr("abcdefghijklmn", 3));
	}

}
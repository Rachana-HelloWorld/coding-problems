package com.practice.dp;

import java.util.HashMap;
import java.util.Map;

//Function to find best way to cut a rod of length n
// where rod of length i depicted by array a has a cost p[i-1]
public class RodCutting {

//	static Map<String, Integer> map = new HashMap<>();

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] p = { 1, 5, 8, 9, 10, 17, 17, 20 };
		int sum = 4;

		int result = rodCutting(p, a, a.length - 1, sum, 0);
		System.out.println("Maximum price is : " + result);

	}

	static int rodCutting(int[] p, int[] a, int n, int sum, int price) {

//		if (map.containsKey(n + "," + sum + "," + price))
//			return map.get(n + "," + sum + "," + price);

		if (n < 0 && sum != 0)
			return 0;
		if (sum == 0)
			return price;
		int res1 = rodCutting(p, a, n - 1, sum - a[n], price + p[n]);
		int res2 = rodCutting(p, a, n, sum - a[n], price + p[n]);
		int res3 = rodCutting(p, a, n - 1, sum, price);
		int result = Math.max(Math.max(res1, res2), res3);

//		map.put(n + "," + sum + "," + price, result);

		return result;

	}

}

package com.practice.ds;

import java.util.ArrayList;
import java.util.HashSet;

class SubarraysWithKDistinct {

	public static void main(String args[]) {

		int[] A = { 1, 1, 1, 6, 9, 1, 0, 8, 7, 6, 0 };
		int K = 3;

		int result = subarraysWithKDistinct(A, K);
		System.out.println(result);

	}

	public static int subarraysWithKDistinct(int[] A, int K) {
		Check.count = 0;
		for (int i = 0; i <= A.length - K; i++) {
			Check check = new Check();

			for (int j = i; j <= A.length - 1; j++) {
				check.checkIfKDistinct(A[j], K);
			}
		}

		return Check.count;
	}
}

class Check {

	static int count = 0;
	int elecount = 0;
	ArrayList<Integer> list = new ArrayList<>();
	HashSet<Integer> set = new HashSet<Integer>();

	public void checkIfKDistinct(int element, int k) {

		if (set.contains(element)) {
			list.add(element);
			set.add(element);
		} else {
			if (++elecount > k)
				return;
			list.add(element);
			set.add(element);
		}

		if (elecount == k)
			count++;

	}
}

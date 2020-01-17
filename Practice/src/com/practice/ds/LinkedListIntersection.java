package com.practice.ds;

import java.util.HashSet;
import java.util.Set;

// There are two singly linked lists in a system. By some programming error, 
// the end node of one of the linked list got linked to the second list, forming an inverted Y shaped list. 
// Write a program to get the point where two linked list merge.

public class LinkedListIntersection {

	public static void main(String[] args) {

		LLNode first;
		LLNode second;
		LLNode intersection = new LLNode(2, new LLNode(15, null));

		// initializing two linked lists
		first = new LLNode(5, new LLNode(10, intersection)); // 5 -> 10 -> 2 -> 15
		second = new LLNode(2, new LLNode(13, intersection)); // 2 -> 13 -> 2 ->15

		// intersection point should be 2 -> 15

		LLNode result = intersection(first, second);

		while (result != null) {
			System.out.println(result.getData());
			result = result.getNext();
		}
	}

	static LLNode intersection(LLNode first, LLNode second) {

		Set<LLNode> set = new HashSet<>();

		while (first != null) {
			set.add(first);
			first = first.getNext();
		}

		while (second != null) {
			if (set.contains(second)) {
				return second;
			}
			second = second.getNext();
		}
		return null;
	}
}

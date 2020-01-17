package com.practice.ds;

// Program to reverse a Linked List
public class LLReversal {

	public static void main(String[] args) {

		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);

		first.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);
		fifth.setNext(sixth);
		sixth.setNext(null);

		// print before reversal
		print(first);
		System.out.println();

		// reverse the LL
		first = reverse(first);
		print(first);
	}

	static Node reverse(Node head) {
		Node p = null;
		Node q = head.getNext();
		Node current = head;

		while (current != null) {
			current.setNext(p);
			p = current;
			current = q;
			if (q != null)
				q = q.getNext();
		}

		head = p;
		return head;
	}

	static void print(Node node) {

		while (node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
	}
}

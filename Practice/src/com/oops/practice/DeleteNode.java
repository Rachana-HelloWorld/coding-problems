package com.oops.practice;

public class DeleteNode {

	static void deleteNode(LLNode current) {

		LLNode next = current.getNext();

		// if next = null, then the node to be deleted is the last node
		if (next != null) {
			current.setData(next.getData());
			current.setNext(next.getNext());
			next = null;
		} else
			current = null;
	}

	public static void main(String[] args) {

		LLNode current = new LLNode(2, new LLNode(7, new LLNode(12, null)));
		LLNode node = new LLNode(5, new LLNode(10, current));

		// print all the nodes of LL
		print(node);

		// passing the pointer to the node to be deleted
		deleteNode(current);

		System.out.println();
		// This will print the LL after current has been deleted
		print(node);

	}

	static void print(LLNode node) {

		while (node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
	}

}

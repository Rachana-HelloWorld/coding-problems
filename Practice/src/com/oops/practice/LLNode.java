package com.oops.practice;

public class LLNode {

	private LLNode next;
	private int data;

	public LLNode(int data, LLNode newNode) {
		this.data = data;
		this.next = newNode;
	}

	public LLNode getNext() {
		return next;
	}

	public void setNext(LLNode next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}

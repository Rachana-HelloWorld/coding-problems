package com.oops.practice;

import java.util.Stack;

// Design a Data Structure SpecialStack that supports all the stack operations 
// like push(), pop(), isEmpty(), isFull() and an additional operation getMin() 
// which should return minimum element from the SpecialStack. 
// All these operations of SpecialStack must be O(1). 
// To implement SpecialStack, you should only use standard Stack data structure 
// and no other data structure like arrays, list, .. etc.

public class StackGetMin {

	public static void main(String[] args) {

		SpecialStack stack = new SpecialStack();
		stack.push(5);
		stack.push(10);
		stack.push(3);
		stack.push(4);
		stack.push(2);
		stack.push(12);

		System.out.println(stack.getMin());

		stack.pop();
		System.out.println(stack.getMin());

		stack.pop();
		System.out.println(stack.getMin());

		stack.pop();
		System.out.println(stack.getMin());

		stack.pop();
		System.out.println(stack.getMin());

	}

}

class SpecialStack {

	Stack<Integer> stack;
	Stack<Integer> auxillaryStack;

	public SpecialStack() {
		super();
		this.stack = new Stack<>();
		this.auxillaryStack = new Stack<>();
	}

	public void push(int ele) {
		stack.push(ele);

		if (auxillaryStack.size() == 0)
			auxillaryStack.push(ele);

		if (ele < auxillaryStack.peek())
			auxillaryStack.push(ele);
		else
			auxillaryStack.push(auxillaryStack.peek());
	}

	public int pop() {

		auxillaryStack.pop();
		return stack.pop();
	}

	public int peek() {
		return stack.peek();
	}

	public int getMin() {
		return auxillaryStack.peek();
	}
}

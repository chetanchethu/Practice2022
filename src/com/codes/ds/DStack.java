package com.codes.ds;

public class DStack {
	int top = 0;
	int capacity = 2;
	int[] stack = new int[capacity];

	public void push(int data) {
		if (capacity == size()) {
			expand();
		}
		stack[top] = data;
		top++;
	}

	private void expand() {
		int[] nStack = new int[capacity * 2];
		System.arraycopy(stack, 0, nStack, 0, capacity);
		stack = nStack;
		capacity *= 2;
	}

	public int pop() {
		int data = 0;
		if (isEmpty()) {
			System.out.println("Underflow");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
			shrink();
		}
		return data;
	}

	private void shrink() {
		if(size()==(capacity/2)/2) {
			capacity/=2;
			int[] nStack = new int[capacity];
			System.arraycopy(stack, 0, nStack, 0, capacity);
			stack = nStack;
		}
		
	}

	public int peek() {
		int data;
		data = stack[top - 1];
		return data;
	}

	private boolean isEmpty() {
		return top <= 0;
	}

	public void display() {
		System.out.println(capacity);
		for (int n : stack) {
			System.out.println(n);
		}

	}

	int size() {
		return top;
	}

	public static void main(String[] args) {
		DStack s = new DStack();
		s.push(1);
		s.push(2);
		s.push(3);
	}

}

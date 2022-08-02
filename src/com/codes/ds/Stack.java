package com.codes.ds;

//their are 2ways to implement stack 1)using arrays 2)using linked list
//In this code stack is implemented using array
public class Stack {
	int[] stack = new int[5];
	int top = 0;

	public void push(int data) {
		if (top == stack.length) {
			System.out.println("Stack overflow");
		} else {
			stack[top] = data;
			top++;
		}
	}

	public int pop() {
		int data = 0;
		if (isEmpty()) {
			System.out.println("stack overflow");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
		}
		return data;
	}

	public int peek() {
		int data;
		data = stack[top - 1];
		return data;
	}

	public void display() {
		for (int n : stack) {
			System.out.print(n + " ");
		}
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top <= 0;
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(4);
		s.push(5);
		s.push(2);
//		s.push(0);
//		System.out.println(s.size());
//		s.display();
//		System.out.println();
//		System.out.println(s.pop());
//		System.out.println(s.peek());

	}

}

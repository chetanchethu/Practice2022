package com.codes.ds;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {
static class Queues {
		
		Stack<Integer> stack1;
		Stack<Integer> stack2;
	}

	static void push(Stack<Integer> st, int data) {
		st.push(data);
	}

	static int pop(Stack<Integer> st) {
		if (st.isEmpty())
			return -1;
		return st.pop();
	}

	static void enQueue(Queues q, int data) {
		push(q.stack1, data);
	}

	static int deQueue(Queues q) {
		int x;
		if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
			return -1;
		} else {
			if (q.stack2.isEmpty()) {
				while (!q.stack1.isEmpty()) {
					x = pop(q.stack1);
					push(q.stack2, x);
				}

			}
			x = pop(q.stack2);
		}
		return x;

	}

	static int top(Queues q) {
		int x;
		if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
			return -1;
		} else {
			if (q.stack2.isEmpty()) {
				while (!q.stack1.isEmpty()) {
					x = pop(q.stack1);
					push(q.stack2, x);
				}

			}
			x = q.stack2.peek();
		}
		return x;

	}

	public static void main(String[] args) {
		Queues q = new Queues();
		q.stack1 = new Stack();
		q.stack2 = new Stack();
		enQueue(q, 3);
		enQueue(q, 4);
		System.out.println(top(q));
		enQueue(q, 5);
		System.out.println(deQueue(q));
		System.out.println(deQueue(q));
		System.out.println(deQueue(q));

	}

}

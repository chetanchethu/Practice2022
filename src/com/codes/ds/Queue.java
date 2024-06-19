package com.codes.ds;

public class Queue {
	int front;
	int rear;
	int size;
	int[] queue = new int[5];
	int n = queue.length;

	public void enQueue(int data) {
		if (!sizeFull()) {
			queue[rear] = data;
			rear = (rear + 1) % n;
			size++;
		} else
			System.out.println("Queue is full");
	}

	public int getSize() {
		return size;
	}

	public boolean sizeFull() {
		return getSize() == n;
	}

	public int deQueue() {
		int data=0;
		if (!isEmpty()) {
			data = queue[front];
			front = (front + 1) % n;
			size--;
		} else
			System.out.println("Queue is empty");
		return data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(i) % n] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(6);
		q.enQueue(7);
		q.enQueue(8);
		q.enQueue(9);
		q.enQueue(10);
		q.show();
		q.deQueue();
		q.deQueue();
		q.show();
	}

}

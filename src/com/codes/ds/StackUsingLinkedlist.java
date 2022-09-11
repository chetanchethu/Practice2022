package com.codes.ds;

public class StackUsingLinkedlist {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	int top = 0;

	void push(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			top++;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			top++;
		}
	}

	int peek() {
		Node n = head;
		int data = 0;
		while (n != null) {
			if (n.next == null) {
				data = n.data;
				return data;
			} else {
				n = n.next;
			}
		}
		return data;
	}

	void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	int pop() {
		int data = 0;
		Node n = head;
		while (n.next.next != null) {// 1,2,3,4,5 //n=4
			n = n.next;
		}
		Node n1 = null;
		n1 = n.next; // 5
		data = n1.data;
		n.next = null;
		return data;
	}

	int size() {
		int count = 0;
		Node n = head;
		while (n != null) {
			count++;
			n=n.next;
		}
		return count;
	}

	public static void main(String[] args) {
		StackUsingLinkedlist l = new StackUsingLinkedlist();
		//System.out.println("Size is: "+l.size());
		System.out.println("empty?: " + l.isEmpty());
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(8);
		l.display();
		System.out.println();
		System.out.println("popped element is: " + l.pop());
		System.out.println("peek element: " + l.peek());
		System.out.println("popped element is: " + l.pop());
		l.push(100);
		l.display();
		System.out.println();
		System.out.println("empty?: " + l.isEmpty());
		System.out.println("Size is: "+l.size());
	}

}

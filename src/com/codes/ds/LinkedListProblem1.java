package com.codes.ds;

//To find the mid element of the linked list in one pass 
public class LinkedListProblem1 {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;
	Node tail = null;

	void add(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	void mid() {
		Node s = head;
		Node f = head;
		while (f != null && f.next != null) {
			f = f.next.next;
			s = s.next;
		}
		System.out.println(s.data);
	}

	void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedListProblem1 p = new LinkedListProblem1();
		p.add(6);
		p.add(8);
		p.add(1);
		p.add(3);
		p.display();
		p.mid();
	}
}

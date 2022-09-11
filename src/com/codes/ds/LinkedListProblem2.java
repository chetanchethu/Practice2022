package com.codes.ds;

//To find whether a Linked list contains a cycle or not 
public class LinkedListProblem2 {

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

	void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.print("null");
		System.out.println();
	}

	void findCycle() {
		Node f = head;
		Node s = head;
		while (s != null && f != null && f.next != null) {
			f = f.next.next;
			s = s.next;
			if (s == f) {
				System.out.print("Loop detected at -> " + s.data);
				break;
			}
		}
	}

	public static void main(String[] args) {
		LinkedListProblem2 p = new LinkedListProblem2();
		p.add(1);
		p.add(2);
		p.add(3);
		p.add(4);
		p.add(5);
		p.display();
		// Creation of Loop
		System.out.println(p.head.next.next.next.next.data);
		System.out.println(p.head.next.next.data);
		p.head.next.next.next.next = p.head.next.next;

		p.findCycle();
		// complexity is o(n)here
	}
}

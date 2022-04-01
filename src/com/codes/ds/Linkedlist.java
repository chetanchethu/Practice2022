package com.codes.ds;

public class Linkedlist {
	Node head;

	static class Node {
		int data;
		Node next;
	}

	public void display() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);

	}

	public void add(int data) {
		Node node = new Node();
		node.data = data;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void delete(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
		}
	}

	public void addFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;

	}

	public void AddAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		if (index == 0) {
			node.next = head;
			head = node;
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next; // 2
			}
			node.next = n.next;
			n.next = node;

		}

	}

	public static void main(String[] args) {
		Linkedlist l = new Linkedlist();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		// l.AddAt(2, 124);
		l.addFirst(12312);
		l.delete(2);
		l.display();
	}
}

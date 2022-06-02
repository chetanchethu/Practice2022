package com.codes.ds;

public class Li {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	void addLast(int data) {
		Node node = new Node(data);
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

	void display() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	void addFirst(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	void addAt(int index, int data) {
		Node node = new Node(data);
		if (index == 0) {
			addFirst(data);
		} else {
			Node n = head; // 2
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	void delete(int index) {
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

	int length() {
		Node n = head;
		int length = 0;
		while (n != null) {
			length++;
			n = n.next;
		}
		System.out.println(length);
		return length;
	}

	Node reverse(Node l) {
		Node n = l;
		Node n1 = null;
		Node n2 = null;
		while (n != null) {
			n1 = n.next;
			n.next = n2;
			n2 = n;
			n = n1;
		}
		l = n2;
		return l;
	}

	int mid(Node l) {
		int k = length();
		int res = 0;
		if (k % 2 == 0) {
			res = 0;
		} else {
			Node n = l;
			int d = k / 2;
			d++;
			for (int i = 1; i < d; i++) {
				n = n.next;
			}
			res = n.data;
		}
		return res;
	}

	public static void main(String[] args) {
		Li l = new Li();
		l.addLast(1);
		l.addLast(2);
		l.addLast(4);
		l.addLast(6);
		l.addLast(8);
		l.addLast(9);
		l.addLast(10);
		System.out.println(l.mid(head));
//	    l.addFirst(100);

//		l.addAt(2, 13);
//		l.delete(0);
//		l.length();
		// head=l.reverse(head);
//		l.display();
	}
}

package com.codes.ds;

public class FindNthFromEnd {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
		}
	}

	void display() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	int nthNode(int n, Node head) {
		Node c = head;
		Node nth = head;
		while (n != 0) {
			if (c == null) {
				return -1;
			} else {
				c = c.next;
				n--;
			}
		}
		while (c != null) {
			c = c.next;
			nth = nth.next;
		}
		if (nth != null)
			return nth.data;
		else
			return -1;
	}

	public static void main(String[] args) {
		FindNthFromEnd f = new FindNthFromEnd();
		f.head = new Node(1);
		f.head.next = new Node(2);
		f.head.next.next = new Node(3);
		f.head.next.next.next = new Node(4);
		f.head.next.next.next.next = new Node(5);
		System.out.println(f.nthNode(2, head));
	}
}

package com.codes.ds;
public class Link {
	static Node head;

	static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}

	Node rev(Node l) {
		Node prev = null;
		Node nexthead = null;
		Node n = l;
		while (n.next != null) {
			nexthead = n.next;
			n.next = prev;
			prev = head;
			head = nexthead;
		}
		l=prev;
		return l;
	}

	void disp() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
		}
		System.out.println(n.data);
	}

	public static void main(String[] args) {
		Link l = new Link();
		l.head = new Node(1);
		l.head.next = new Node(2);
		l.head.next.next = new Node(3);
		head = l.rev(head);
		l.disp();
	}
	
}

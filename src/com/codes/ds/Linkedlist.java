package com.codes.ds;

public class Linkedlist {
	 static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	void add(int data) {
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

	void addAt(int index, int data) {
		Node node = new Node(data);
	
		if (index == 0) {
			head = node;
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	void addFirst(int data) {
		Node node = new Node(data);
		
		node.next = head;
		head = node;
	}

	void display() {
		Node n = head;
		while (n.next != null) {
			System.out.print(n.data + "  ");
			n = n.next;
		}
		System.out.print(n.data);
		System.out.println();
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
		int count = 0;
		while (n != null) {
			count++;
			n = n.next;
		}

		return count;
	}
	
	public void lengths() {
		Node n = head;
		int len = 0;
		while (n != null) {
			len++;
			n = n.next;
		}
		System.out.println("Length is: " + len);
	}

	public boolean isPresent(int data) {
		Node n = head;
		while (n != null) {
			if (n.data == data) {
				return true;
			}
			n = n.next;
		}
		return false;
	}

	Node reverse(Node l) {
//		display();
		Node n = l;  //current
		Node n1 = null;//next
		Node n2 = null;//prev
		while (n != null) {
			n1 = n.next;
			n.next = n2;
			n2 = n;
			n = n1;
		}l=n2;
		return l;
	}

	public static void main(String[] args) {
		Linkedlist l = new Linkedlist();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		// l.addAt(2, 199);
		// l.display();
		head=l.reverse(head);
		l.display();

		
		
//		Linkedlist l2 = new Linkedlist();
//		l2.head=new Node(6);
//		l2.head.next=new Node(7);
//		l2.head.next.next=new Node(8);
//		head=l2.reverse(head);
//		l2.display();

		l.length();
		l.isPresent(2);

	}
}

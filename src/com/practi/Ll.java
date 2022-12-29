package com.practi;

public class Ll {
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

	void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.println();
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
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next; // 1,2,3,4,5 //n=2
			}
			n1=n.next;//3
			n.next=node;
			node.next=n1;
		}
	}
	
	void delete(int index) {
		if(index==0) {
			head=head.next;
		}
		else {
			Node n=head;
			Node n1=null;
			for (int i = 0; i < index-1; i++) {
				n=n.next; //1,2,3,4,5
			}
			n1=n.next;
			n.next=n1.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ll k=new Ll();
k.add(1);k.add(2);k.add(3);k.add(4);k.add(5);
k.display();
k.addAt(2, 100);
k.display();
k.delete(3);k.display();}

}

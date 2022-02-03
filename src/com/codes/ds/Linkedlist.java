package com.codes.ds;

public class Linkedlist {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public void printData() {
		Node n = head;
		if (n == null) {
			System.out.println("Linkedlist is Empty");
		}
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

//Add after 1st position
	public void addFirst(int data) {
		Node addFirst = new Node(data);
		addFirst.next = head;
		head = addFirst;
		printData();
	}

//Add after specific node	
	public void addAfterSpecificNode(Node previousNode, int data) {
		Node n = new Node(data);
		if (previousNode == null) {
			System.out.println("the previous node cannot be null");
		}
		n.next = previousNode.next;
		previousNode.next = n;
		printData();
	}

	//add at end
	public void addAtEnd(int data) {
		 Node n= new Node(data);
		if(head==null) {
			head=new Node(data);		
		}
		n.next=null;
		
		Node l=head;
		while(l.next!=null) 
			l=l.next;
			l.next=n;
		printData();

	}

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		list.head = new Node(2);
		Node second = new Node(3);
		list.head.next = second;
		Node third = new Node(4);
		second.next = third;

		// list.printData();
		// list.addFirst(1);
		// list.addAfterSpecificNode(second, 5);
		list.addAtEnd(655);
	}
}

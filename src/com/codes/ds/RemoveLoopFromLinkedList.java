package com.codes.ds;

//Note for loop detection we initially place fast and slow at head;.This is seen in LinkedlistProgram2.java class.
//Whereas in detect and remove loop we place fast and slow at head.next. This is seen in this program
public class RemoveLoopFromLinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
		}
	}

	void detectAndRemoveLoop(Node head) {
		if (head == null || head.next == null)
			return;

		Node slow = head;
		Node fast = head;
		///////////////////
		slow = slow.next;
		fast = fast.next.next;
		///////////////////
		while (fast != null && fast.next != null) {
			if (slow == fast)
				break;

			slow = slow.next;
			fast = fast.next.next;
		}
		if (slow == fast) {
			slow = head;
			if (slow != fast) {
				while (slow.next != fast.next) {
					slow = slow.next;
					fast = fast.next;
				}
				fast.next = null; /* remove loop */
			}
			/* This case is added if fast and slow pointer meet at first position. */
			else {
				while (fast.next != slow) {
					fast = fast.next;
				}
				fast.next = null;
			}
		}

	}

	void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data);
			n = n.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		RemoveLoopFromLinkedList r = new RemoveLoopFromLinkedList();
		r.head = new Node(1);
		r.head.next = new Node(2);
		r.head.next.next = new Node(3);
		r.head.next.next.next = new Node(4);
		r.head.next.next.next.next = new Node(5);
		r.head.next.next.next.next.next = r.head.next.next;
		//		r.display();
		r.detectAndRemoveLoop(head);
		r.display();

	}
}

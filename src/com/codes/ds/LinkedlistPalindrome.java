package com.codes.ds;

public class LinkedlistPalindrome {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
		}
	}

	private boolean isPalindrome(Node head2) {
		int size = size(head);
		int[] a = new int[size];
		Node n = head;
		int temp = 0;
		while (n != null) {
			a[temp] = n.data;
			temp++;
			n = n.next;
		}
		return isEqual(a);
	}

	int size(Node head) {
		int count = 0;
		Node n = head;
		while (n != null) {
			count++;
			n = n.next;
		}
		return count;
	}

	boolean isEqual(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] != a[a.length - i - 1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		LinkedlistPalindrome l = new LinkedlistPalindrome();
		l.head = new Node(1);
		l.head.next = new Node(2);
		l.head.next.next = new Node(2);
		l.head.next.next.next = new Node(1);
		System.out.println(l.isPalindrome(head));
	}

}

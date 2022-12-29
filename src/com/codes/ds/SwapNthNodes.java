package com.codes.ds;

//Given a singly linked list of size N, and an integer K. 
//You need to swap the Kth node from the beginning and Kth node from the end of the linked list.
//Swap the nodes through the links. Do not change the content of the nodes.
/*
 * Input:
N = 4,  K = 1
value[] = {1,2,3,4}
Output: 1
Explanation: Here K = 1, hence after
swapping the 1st node from the beginning
and end thenew list will be 4 2 3 1.
 

Example 2:

Input:
N = 5,  K = 7
value[] = {1,2,3,4,5}
Output: 1
Explanation: K > N. Swapping is invalid. 
Return the head node as it is.
 */
public class SwapNthNodes {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static void push(int data) {
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

	static Node swap(Node head, int n, int k) {
		if (k > n)  //n=8 k=4
			return head;
		if (k == n - k + 1)//3
			return head;

		Node x = head, prevX = null;
		Node y = head, prevY = null;
		for (int i = 1; i < k; i++) { // Get X(k from start) to the node which needs to be swapped.
			prevX = x;
			x = x.next;
		}

		for (int i = 1; i < n - k + 1; i++) {//// Get y(n-k+1 from end) to the node which needs to be swapped.
			prevY = y;
			y = y.next;
		}

		// change the link of prevX and prevY
		if (prevX != null) {
			prevX.next = y;
		}
		if (prevY != null) {
			prevY.next = x;
		}
		// change nodes after x and y
		Node temp = x.next;
		x.next = y.next;
		y.next = temp;
		disp();
		// setting head value when k value is 1 or n
		if (k == 1)
			head = y;
		if (k == n)
			head = x;
		return head;

	}

	static void disp() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data+" ");
			n = n.next;
		}System.out.println();
	}

	
	public static void main(String[] args) {
		SwapNthNodes s = new SwapNthNodes();
		SwapNthNodes.push(1);//1,2,3,4,5,6,7
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);s.push(6);s.push(7);s.push(8);
		Node res = s.swap(head, 8, 3);
		System.out.println(res.data);
	}

}

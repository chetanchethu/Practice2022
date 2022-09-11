package com.codes.ds;

public class DleteAlterNodes {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
		}
	}

	void add(int data) {
		
		Node n = head;
		Node node = new Node(data);
		if (head == null)
			head = node;
		else {
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	void del(Node head) {
        if (head == null)
            return;
		Node n = head;
		Node n1 = null;
		while (n != null && n.next != null) {
			n.next = n.next.next;
			n = n.next;
		}
		
		//Using Recursion
//		 if (head == null) 
//		        return; 
//		  
//		    Node node = head.next; 
//		  
//		    if (node == null) 
//		        return; 
//		  
//		    /* Change the next link of head */
//		    head.next = node.next; 
//		  
//		  
//		    /* Recursively call for the new next of head */
//		    head.next = del(head.next); 
	}

	void show() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		DleteAlterNodes d = new DleteAlterNodes();
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		d.add(5);
		d.add(6);
		d.del(head);
		d.show();
	}

}

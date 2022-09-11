package com.codes.ds;

public class SumOftwoLinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	static Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node nextNode = null;
		while (curr != null) {
			nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		return prev;
	}

	void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	

	public static void main(String[] args) {
		SumOftwoLinkedList f1 = new SumOftwoLinkedList();
		f1.head = new Node(1);
		f1.head.next = new Node(2);
		f1.head.next.next = new Node(3);

		SumOftwoLinkedList f2 = new SumOftwoLinkedList();
		f2.head = new Node(4);
		f2.head.next = new Node(5);
		f2.head.next.next = new Node(6);
		head = f1.reverse(head);
		f1.display();
	//head=	System.out.println(addTwoLists(head	, head));
	}
	
	
	 static Node addTwoLists(Node first, Node second){
	        
	        //reversing both lists to simplify addition.
	        first = reverse(first);      
	        second = reverse(second);     
	        
	        Node sum = null;
	        int carry = 0;
	        
	        //using a loop till both lists and carry gets exhausted.
	        while( first!=null || second!=null || carry>0 )
	        {
	            //using a variable to store sum of two digits along with carry.
	            int newVal = carry;
	            
	            //if nodes are left in any list, we add their data in newVal.
	            if(first!=null) newVal+=first.data;
	            if(second!=null) newVal+=second.data;
	            
	            //updating carry.
	            carry = newVal / 10;
	            
	            //using modulus to store only a single digit at that place.
	            newVal = newVal % 10;
	            
	            //creating new node which gets connected with other nodes that 
	            //we get after calculating sum of respective digits.
	            Node newNode = new Node(newVal);
	            
	            //storing the previously made nodes in the link part of new node.
	            newNode.next = sum;
	            //making the new node as the first node of all previously made node.
	            sum = newNode;
	            
	            //moving ahead in both lists.
	            if(first!=null) first = first.next;      
	            if(second!=null) second = second.next;
	        }
	        
	        return sum;
	    }

}

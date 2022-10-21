package com.practi;

import java.util.PriorityQueue;

public class C {
public static void main(String[] args) {
	PriorityQueue<String> pq=new PriorityQueue<>();
	pq.add("carr");
	pq.add("app");
	pq.add("ban");
	System.out.println(pq.poll()+":"+pq.peek());
}
}

package com.practi.fiveyrs;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) throws Exception {
	Stream.iterate(new AbstractMap.SimpleEntry<>(0,1), 
			e->new AbstractMap.SimpleEntry<>(e.getValue(), e.getValue()+e.getKey()))
	.limit(5).forEach(e->System.out.print(e.getKey()));
		
	
}
}

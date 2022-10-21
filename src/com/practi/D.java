package com.practi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class D {
public static void main(String[] args) {
	List l=new ArrayList<>();
	l.add("1");l.add("2");l.add("3");
	for(Object obj:reverse(l)) {
		System.out.println(obj+",");
	}
}

public static Iterator reverse(List list) {
	Collections.reverse(list);
	return list.iterator();
}
}

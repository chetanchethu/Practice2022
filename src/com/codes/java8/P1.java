package com.codes.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P1 {
	public static void main(String[] args) {
		Patient p1 = new Patient("p1", 25, "corona", 160000);
		Patient p2 = new Patient("p2", 56, "tb", 25000);
		Patient p3 = new Patient("p3", 61, "corona", 80000);
		Patient p4 = new Patient("p4", 72, "yb", 50000);
		List<Patient> list = new ArrayList<Patient>(Arrays.asList(p1, p2, p3, p4));

		// To get the patients suffering from corona
		list.stream().filter(p->p.getDisease().equals("corona")).forEach(System.out::println);
		
		// To get the average bill paid by corona patients
		double avg_Amount=list.stream().filter(p->p.getDisease().equals("corona"))
		.collect(Collectors.averagingDouble(Patient::getAmount));
		System.out.println(avg_Amount);

	}

}

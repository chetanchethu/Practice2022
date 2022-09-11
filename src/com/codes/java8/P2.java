package com.codes.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class P2 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("ABC", 28, "male", "HR"));
		list.add(new Employee("GHI", 45, "female", "operations"));
		list.add(new Employee("KML", 18, "female", "support"));
		list.add(new Employee("XYZ", 62, "male", "HR"));

		// This is for lost one
		list.add(new Employee("XYZ", 62, "male", "HR"));

		List<String> lists = new ArrayList<String>();
		// To get distinct department
		lists = list.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		System.out.println(lists);
		// OR
		list.stream().map(p -> p.getDepartment()).distinct().forEach(System.out::println);
		// To get no of employees working in HR department
		System.out.println(list.stream().filter(q -> q.getDepartment().equals("HR")).count());
		// To get no of employees working in each department
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(map);
		// To get average age of each gender
		Map<String, Double> m = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(m);

		// Note: To use Set on a customized object we need to override Hashcode and
		// equals method and the same is done in EMployee class
		// To get unique employees(for this set is used) in a sorted manner(Treemap is
		// used) based on their age
		Map<Integer, Set<Employee>> s = list.stream()
				.collect(Collectors.groupingBy(Employee::getAge, TreeMap::new, Collectors.toSet()));
		System.out.println(s);

		// To print duplicate elements in a list
//		List<String> namesinrepo = repo.findall();
//		Set<String> duplicateOrRepeatedNames = new HashSet<>();
//		duplicateOrRepeatedNames = namesinrepo.stream().filter(n -> !duplicateOrRepeatedNames.add(n))
//				.collect(Collectors.toSet());
		// Note the when above filter returns true then that gets added to
		// repeatedorduplicate names
	}
	
}

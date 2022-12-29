package com.practi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {

	public static void main(String[] args) {
		List<Employee> l=Arrays.asList(
				new Employee(1, "abc", 23, "hr", "Male", 23000),
				new Employee(2, "d", 43, "acc", "feMale", 12000), 
				new Employee(3, "t", 12, "wind", "feMale", 23452), 
				new Employee(4, "ts", 90, "fred", "Male", 12687)
				);
		
		Optional<Employee> e=l.stream().sorted(
				Comparator.comparingDouble(Employee::getSalary)).skip(1).findFirst();
		System.out.println(e);
		
	}

}

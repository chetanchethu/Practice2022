package com.codes.java8;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
		// To get unique employees(for this set is used) in a sorted manner
		// based on their age
		Map<Integer, Set<Employee>> s = list.stream()
				.collect(Collectors.groupingBy(Employee::getAge, Collectors.toSet()));
		System.out.println(s);

		// To get nos which starts from 1
		List<Integer> nlist = new ArrayList<Integer>();
		nlist.add(1);
		nlist.add(123);
		nlist.add(456);
		nlist.add(156);
		System.out
				.println(nlist.stream().filter(no -> String.valueOf(no).startsWith("1")).collect(Collectors.toList()));

		// To print list of elements in reverse order
		List<Integer> rlist = new ArrayList<Integer>();
		rlist.add(1);
		rlist.add(123);
		rlist.add(456);
		rlist.add(156);
		System.out.println(rlist.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		// OR (preferred)
		System.out.println(rlist.stream().sorted((a, b) -> Integer.compare(b, a)).collect(Collectors.toList()));

		// To find no of times alphabets repeated
		String ss = "abc def max doctor";
		List<Character> li = ss.replace(" ", "").chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		String mm = li.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().map(entry -> entry.getKey() + "" + entry.getValue()).collect(Collectors.joining());
		System.out.println(mm);

		// To find given string are anagrams or not
		String s1 = "max";
		String s2 = "amx";
		System.out.println(s1.chars().sorted().boxed().collect(Collectors.toList())
				.equals(s2.chars().sorted().boxed().collect(Collectors.toList())));

		// ****To print the string based on length
		List<String> listt = new ArrayList<>();

		listt.add("java");
		listt.add("python");
		listt.add("dotnet");
		listt.stream().sorted(Comparator.comparing(String::length).thenComparing((a, b) -> a.compareTo(b)));
		// listt.sort(Comparator.comparingInt(String::length).thenComparing((a,b)->a.compareTo(b)));

		System.out.println(listt);

		// to pring 2nd highest number
		List<Integer> listi = new ArrayList<Integer>();
		listi.add(45);
		listi.add(32);
		listi.add(70);
		System.out.println(listi.stream().sorted((a, b) -> Integer.compare(b, a)).distinct().skip(1).findFirst().get());
		// OR for 2nd lowest no
//			System.out.println(
//					listi.stream().sorted().distinct().skip(1).findFirst().get()
//					);
		// ANdforInfo
		System.out.println(listi.stream().sorted((a, b) -> b - a).collect(Collectors.toList()));
		// Given a String,
		// find the first non-repeated character in it using Stream functions?
		String nonRepeat = "mathsah";// mts
		Character result = nonRepeat.chars().mapToObj(sss -> Character.toLowerCase((char) sss)) // First convert to								// then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Store																							// count
				.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println(result);
		// to print all unique chars
		System.out.println(nonRepeat.chars().mapToObj(sq -> String.valueOf((char) sq)).collect(Collectors.toSet())
				.stream().collect(Collectors.joining()));
		// convert array to list
		int d[] = { 23, 12, 92 };
		// preferred//
		List<Integer> arraylist = IntStream.of(d).boxed().collect(Collectors.toList());
		// OR
		List<Integer> arraylist1 = Arrays.stream(d).boxed().collect(Collectors.toList());

		// ****Merge two Employee ArrayList and sort by age in using java8 stream API
		List<Employee> list1 = new ArrayList<Employee>();
		List<Employee> list2 = new ArrayList<Employee>();
		Stream.concat(list1.stream(), list2.stream()).sorted(Comparator.comparingInt(Employee::getAge))
				.collect(Collectors.toList());

		// Sort employee byname and salary using java 8 stream API
		list.stream().sorted(
				Comparator.comparing(Employee::getName).thenComparing(Comparator.comparingInt(Employee::getSalary)))
				.collect(Collectors.toList());

		// Sort Employee based on gender and age is above 30 using Java 8 stream API
		List<Employee> sortedEmployees = list.stream().filter(e -> e.getAge() > 30)
				.sorted(Comparator.comparing(Employee::getGender)).collect(Collectors.toList());

		// first 3 highest salary
		Employee e1 = new Employee("abc", 21, "M", "poi", 2000);
		Employee e2 = new Employee("def", 21, "M", "poi", 1000);
		Employee e3 = new Employee("ghi", 21, "M", "poi", 500);
		Employee e4 = new Employee("jkl", 21, "M", "poi", 3000);
		List<Employee> listsa = new ArrayList<Employee>();
		listsa.add(e1);
		listsa.add(e2);
		listsa.add(e3);
		listsa.add(e4);
		System.out.println(
				list.stream().sorted((a, b) -> b.getSalary() - a.getSalary()).limit(3).collect(Collectors.toList()));
		// To print duplicate elements in a list
//		List<String> namesinrepo = repo.findall();
//		Set<String> duplicateOrRepeatedNames = new HashSet<>();
//		duplicateOrRepeatedNames = namesinrepo.stream().filter(n -> !duplicateOrRepeatedNames.add(n))
//				.collect(Collectors.toSet());
		// Note the when above filter returns true then that gets added to
		// repeatedorduplicate names

		// ****to reverse array
		List<Integer> nqlist = new ArrayList<Integer>();
		nqlist.add(1);
		nqlist.add(123);
		nqlist.add(456);
		nqlist.add(156);
		System.out.print(IntStream.range(0, nqlist.size()).mapToObj(i -> nqlist.get(nqlist.size() - i - 1))
				.collect(Collectors.toList()));

		int[] arr = { 92, 102, 90, 122, 10 };
		int[] rev = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
		;
		System.out.println(Arrays.toString(rev));
		// **To reverse string
		String sss = "cht";
		System.out.println(sss.chars().mapToObj(o -> String.valueOf((char) o))
				.reduce((accumulator, character) -> character + accumulator).get());
		// ****to find no of times java repeated
		String[] a = { "java cuba", "maka java ma java", };
		String b = "java";
		System.out.println(Arrays.stream(a).filter(aa -> aa.contains(b)).flatMap(qwe -> Arrays.stream(qwe.split(" ")))
				.filter(p -> p.equals(b)).count());

		// To print fibonacci
		Stream.iterate(new AbstractMap.SimpleEntry<>(0, 1),
				entry -> new AbstractMap.SimpleEntry<>(entry.getValue(), entry.getKey() + entry.getValue())).limit(8)
				.forEach(t -> System.out.print(t.getKey() + " "));
	
	}
	
	//predicates-accepts single argument, does some sort of processing 
    //	and returns boolean value.test method use it
	//eg:- Predicate<Integer> les=i->(i<18);
	//les.test(10)
	//predicate chaining example
	//Predicate<Integer> les=i->(i<18);
	//Predicate<Integer> grt=i->(i<18);
	//boolean res=les.and(grt).test(20);
	//boolean res=les.and(grt).negate().test(20);
	//predicate OR example
	//les.or(grt.test(contains));
	

}

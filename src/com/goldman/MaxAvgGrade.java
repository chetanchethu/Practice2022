 package com.goldman;
import java.util.*;

public class MaxAvgGrade {
    static class Student{
    	String name;
    	int grade;
    Student(String name,int grade){
    		this.name=name;
    		this.grade=grade;
    	}
    }
	public static void main(String[] args) {
      Student[] students=new Student[] {
    		  new Student("Alice", 90),
              new Student("Bob", 80),
              new Student("Charlie", 70),
              new Student("Alice", 95),
              new Student("Charlie", 85)	  
      };
      
      System.out.println(computeAvg(students));
    }
	private static double computeAvg(Student[] students) {
	Map<String,List<Integer>> hm=new HashMap<>();
	for(Student s:students) {
//		hm.computeIfAbsent(s.name, k->new ArrayList<>()).add(s.grade);
		if(hm.containsKey(s.name)) {
			hm.get(s.name).add(s.grade);
		}else {
			List<Integer> l=new ArrayList<>();
			l.add(s.grade);
			hm.put(s.name, l);
		}
	}System.out.println(hm);
	Map<String,Double> averages=new HashMap<String, Double>();
	for(Map.Entry<String, List<Integer>> entry:hm.entrySet()) {
		String name=entry.getKey();
		List<Integer> grades=entry.getValue();
		double averageOfEach=grades.stream().mapToInt(i->i).average().orElse(0);
		averages.put(name, averageOfEach);
	}
	double max=0;
	for(double average:averages.values()) {
		max=Math.max(max, average);
	}
	
	return max;
}

	}

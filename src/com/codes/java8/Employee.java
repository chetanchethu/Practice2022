package com.codes.java8;

import java.util.Objects;

public class Employee {

	private String name;
	private int age;
	private String gender;
	private String department;
	private int salary;

	public Employee(String name, int age, String gender, String department) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
	}
	public Employee(String name, int age, String gender, String department,int salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.salary=salary;
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", department=" + department + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name);
	}

}

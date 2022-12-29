package com.practi;
//employeeList.stream()
//.sorted
//(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).
//findFirst();
public class Employee {

	int id; 
	String name;
	int age;
	String department;
	String gender;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + ", gender="
				+ gender + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, int age, String department, String gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.gender = gender;
		this.salary = salary;
	}
	
}

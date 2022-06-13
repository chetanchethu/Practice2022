package com.codes.ds;

public class EqualsHashCodeContract2 {
	private Integer id;
	private String salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(this.getClass());
		System.out.println(obj.getClass());
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		EqualsHashCodeContract2 e = (EqualsHashCodeContract2) obj;
		System.out.println(e.getId());
		System.out.println(this.getId());
		return (this.getId() == e.getId());
	}
	
	@Override
	public int hashCode() {
		final int prime=31;
		int result =1;
		result=prime*result+(this.getId()==null?0:this.getId().hashCode());
		return result;
	}
}

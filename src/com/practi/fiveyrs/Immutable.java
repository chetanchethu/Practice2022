package com.practi.fiveyrs;

public final class Immutable {

	private int id;
	private String name;
	
	private Immutable(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	
	
}

package com.mycompany.api.unit.conversion;

public class Student {

	public Student() {
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

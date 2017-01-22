package com.tutorialspoint.web;

public class Student {

	private Integer id;
	private String name;
	private String age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		// System.out.println("get name:" + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		// System.out.println("get age:" + age);
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void afterThrowExcep() {
		// System.out.println("student throw exception");
		throw new IllegalArgumentException();
	}

}

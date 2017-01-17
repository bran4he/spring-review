package com.tutorialspoint3;

public class Student {

	private String name;
	private String age;
	public String getName() {
		System.out.println("get name:" + name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		System.out.println("get age:" + age);
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public void afterThrowExcep(){
		System.out.println("student throw exception");
		throw new IllegalArgumentException();
	}
	
}

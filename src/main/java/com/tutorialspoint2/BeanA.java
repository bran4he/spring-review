package com.tutorialspoint2;

public class BeanA {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void say(){
		System.out.println("bean a saying: " + this.name);
	}
}

package com.tutorialspoint1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class B {

	private A a;
	private String name;
	
	public A getA() {
		return a;
	}
	
//	@Required
	@Autowired
	public void setA(A a) {
		this.a = a;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void talk(){
		System.out.println("B:" + this.name +" is talking...");
	}
}

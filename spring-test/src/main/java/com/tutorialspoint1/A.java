package com.tutorialspoint1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class A {

	
	
	public void say(){
		System.out.println("A is saying...");
	}

	@PostConstruct
	public void init(){
		System.out.println("A @PostConstruct");
	}
	
	public A() {
		System.out.println("A is constructor");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("A is destroy");
	}
}

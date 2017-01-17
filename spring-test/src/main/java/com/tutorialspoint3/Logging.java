package com.tutorialspoint3;

public class Logging {

	public void before(){
		System.out.println("before cut(student method start)===================== ");
	}
	public void after(){
		System.out.println("after cut(student method end)=====================");
	}
	public void around(){
		System.out.println("around cut...");
	}
	public void afterReturnValue(Object retVal){
		System.out.println("after return ..." + retVal.toString());
	}
	public void afterThrowExcep(IllegalArgumentException ex){
		System.out.println("after throw ex..." + ex.toString());
	}
}

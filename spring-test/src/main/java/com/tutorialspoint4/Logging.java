package com.tutorialspoint4;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	@Pointcut("execution(* com.tutorialspoint4.*.*(..))")
	private void selectAll(){}
	
	@Before("selectAll()")
	public void before(){
		System.out.println("before cut(student method start)===================== ");
	}
	@After("selectAll()")
	public void after(){
		System.out.println("after cut(student method end)=====================");
	}
	public void around(){
		System.out.println("around cut...");
	}
	
	@AfterReturning(pointcut="selectAll()", returning="retVal")
	public void afterReturnValue(Object retVal){
		System.out.println("after return ..." + retVal.toString());
	}
	
	@AfterThrowing(pointcut="selectAll()", throwing="ex")
	public void afterThrowExcep(IllegalArgumentException ex){
		System.out.println("after throw ex..." + ex.toString());
	}
}

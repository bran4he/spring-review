package com.tutorialspoint3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans3.xml");
	      Student student = (Student) context.getBean("stu");
	      student.getName();
	      student.getAge();      
	      student.afterThrowExcep();
	}

}

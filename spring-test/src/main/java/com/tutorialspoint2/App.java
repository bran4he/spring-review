package com.tutorialspoint2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Beans2.xml");
		ctx.start();
		BeanA b = (BeanA) ctx.getBean("beana");
		b.say();
		ctx.stop();
	}
}

package com.tutorialspoint1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans1.xml");
		B b = (B) context.getBean("b");
		b.talk();
		AbstractApplicationContext ab = (AbstractApplicationContext)context;
		ab.registerShutdownHook();
		*/
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Cconfig.class);
		C c = ctx.getBean(C.class);
		c.show();
	}

}

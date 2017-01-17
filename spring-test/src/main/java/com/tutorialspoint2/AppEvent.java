package com.tutorialspoint2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Beans2.xml");
		CustomPublisher cp = (CustomPublisher) ctx.getBean("cPublisher");
		cp.publish();
		cp.publish();
	}

}

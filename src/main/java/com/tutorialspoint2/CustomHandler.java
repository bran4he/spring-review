package com.tutorialspoint2;

import org.springframework.context.ApplicationListener;

public class CustomHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		// TODO Auto-generated method stub
		System.out.println("event:" + event.toString());
	}

}

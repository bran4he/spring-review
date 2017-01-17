package com.tutorialspoint2;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;
		
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.publisher = applicationEventPublisher;
	}

	public void publish(){
		CustomEvent e = new CustomEvent(this);
		publisher.publishEvent(e);
	}
}

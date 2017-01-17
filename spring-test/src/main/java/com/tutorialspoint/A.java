package com.tutorialspoint;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;

public class A implements InitializingBean {

	//init-method
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}
	
	@PostConstruct
	public void init(){
		
	}

}

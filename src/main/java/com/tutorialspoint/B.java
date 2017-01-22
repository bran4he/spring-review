package com.tutorialspoint;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;

public class B implements DisposableBean {

	//destroy-method
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub

	}

	@PreDestroy
	public void dd(){
		
	}
}

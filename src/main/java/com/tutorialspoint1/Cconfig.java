package com.tutorialspoint1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cconfig {
	
	@Bean
	public C c(){
		return new C("boy");
	}

}

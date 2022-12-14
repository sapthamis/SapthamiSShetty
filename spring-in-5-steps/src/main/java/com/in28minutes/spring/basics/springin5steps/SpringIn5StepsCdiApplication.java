package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.ComponentScan.ComponentDAO;
import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBuisness;
//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class); 
	
	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class)){
		
		SomeCdiBuisness business = 
				applicationContext.getBean(SomeCdiBuisness.class);
		
		LOGGER.info("{} dao-{}", business, business.getSomecdidao());
		}
	}
}

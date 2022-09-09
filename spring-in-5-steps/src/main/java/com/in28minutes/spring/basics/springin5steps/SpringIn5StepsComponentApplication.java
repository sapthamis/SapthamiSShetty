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
//@SpringBootApplication
@ComponentScan("com.in28minutes.spring.ComponentScan")
@Configuration

public class SpringIn5StepsComponentApplication {
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class); 
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsComponentApplication.class)){
		
		ComponentDAO componentDAO = 
				applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
		}
				
	}

}

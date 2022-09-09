package com.in28minutes.spring.basics.springin5steps;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		//BinarySearchImpl binary=new BinarySearchImpl(new QuickSortAlgorithm());
		//Application Context
		try(AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringIn5StepsApplication.class)){
				//SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binary=applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binary1=applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binary);
		System.out.println(binary1);
		//we get same result..this is the eg of singleton
		int result=binary.binarySearch(new int[] {12,4,6}, 5);
		System.out.println(result);
		}
		
	}

}

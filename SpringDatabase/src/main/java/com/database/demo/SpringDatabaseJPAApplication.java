package com.database.demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.database.demo.dao.PersonJpaRepository;
import com.database.demo.entity.Person;
import com.database.demo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class SpringDatabaseJPAApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDatabaseJPAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("User id 10001 -> {}", repository.findById(10001));
		
//		
//		logger.info("Inserting 10004 -> {}", 
//				repository.insert(new Person(10004, "Tara", "Berlin", new Date())));
//		
//		logger.info("Update 10003 -> {}", 
//				repository.update(new Person(10003, "Pieter", "Utrecht", new Date())));
//
//		repository.deleteById(10002);
//		
//		logger.info("All users -> {}", repository.findAll());
				
	}

}

package com.in28minutes.spring.basics.springin5steps;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsApplication.class)
//@SpringBootTest
class SpringIn5StepsApplicationTests {

	// Get this bean from the context
		@Autowired
		BinarySearchImpl binarySearch;

		@Test
		public void testBasicScenario() {
			
			// call method on binarySearch
			int actualResult = binarySearch.binarySearch(new int[] {}, 5);

			// check if the value is correct
			assertEquals(3, actualResult);

		}

}

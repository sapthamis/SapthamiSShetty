package com.in28minutes.spring.basics.springin5steps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/applicationContext.xml")
class XmlTest {

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

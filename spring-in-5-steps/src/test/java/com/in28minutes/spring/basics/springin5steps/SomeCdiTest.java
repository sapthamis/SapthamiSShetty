package com.in28minutes.spring.basics.springin5steps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBuisness;
import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiDao;

@RunWith(MockitoJUnitRunner.class)
class SomeCdiTest {

	// Inject Mock
		@InjectMocks
		SomeCdiBuisness business;

		// Create Mock
		@Mock
		SomeCdiDao daoMock;

		@Test
		public void testBasicScenario() {
			Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 4 });
			assertEquals(4, business.findGreatest());
		}

		@Test
		public void testBasicScenario_NoElements() {
			Mockito.when(daoMock.getData()).thenReturn(new int[] { });
			assertEquals(Integer.MIN_VALUE, business.findGreatest());
		}

		@Test
		public void testBasicScenario_EqualElements() {
			Mockito.when(daoMock.getData()).thenReturn(new int[] { 2,2});
			assertEquals(2, business.findGreatest());
		}

}

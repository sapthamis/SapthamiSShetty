package com.in28minutes.spring.basics.springin5steps;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	//using qualifier
	
	@Qualifier("bubble")
	
	//autowiring by type
	private SortAlgorithm sortAlgorithm;
	
	
	//if there are two components then we can use autowiring by name
	
	//private SortAlgorithm  bubbleSortAlgorithm;
	

//		public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}


		// Sorting an array cuz inorder to use the binary search we need to sort it
		//Search the array
		//return the result
	
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers =sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array
		return 3;
	}
//	@PostConstruct
//	public void postConstruct() {
//		logger.info("postConstruct");
//	}
//
//	@PreDestroy
//	public void preDestroy() {
//		logger.info("preDestroy");
//	}

	
}

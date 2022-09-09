package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//@Primary
//@Component
@Service
public class QuickSortAlgorithm implements SortAlgorithm{

	public int[] sort(int[] numbers) {
		// Logic for Quick Sort
		return numbers;
	}

}

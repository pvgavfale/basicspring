package com.springproject.basic.basicSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	public int binarySort(int[] array, int numberToSearch) {
		return sortAlgorithm.sort(array);
	}

}

package com.springproject.basic.basicSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorith implements SortAlgorithm {


	public int sort(int[] array) {

		return 2;
	}

}

package com.springproject.basic.basicSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicSpringApplication {

	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		int numberToSearch =2;
		
		//SpringApplication.run(BasicSpringApplication.class, args);
		
		//BinarySearchImpl binarySeach =new BinarySearchImpl();
		ApplicationContext appContext = SpringApplication.run(BasicSpringApplication.class, args);
		BinarySearchImpl binarySeach =appContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySeach.binarySort(array, numberToSearch));
		
	}

}

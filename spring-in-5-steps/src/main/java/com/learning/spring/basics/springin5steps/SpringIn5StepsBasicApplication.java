package com.learning.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.spring.basics.springin5steps.basics.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	//what are beans 
	//what are dependencies for the bean 
	//where to search for the beans 
	
	public static void main(String[] args) {
		//application context maintains all the beans 
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12,  4, 6}, 3);
		System.out.println(result);
		
	}

}

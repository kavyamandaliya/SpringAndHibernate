package com.learning.spring.basics.springin5steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learning.spring.basics.springin5steps.basics.BinarySearchImpl;

@Configuration
@ComponentScan("com.learning.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	//what are beans 
	//what are dependencies for the bean 
	//where to search for the beans 
	
	public static void main(String[] args) {
		//application context maintains all the beans 
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
	
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12,  4, 6}, 3);
		System.out.println(result);
		applicationContext.close();
		
	}

}

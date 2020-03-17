package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read config file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextNew.xml");
		
		//get bean from spring container 
		NewCoach theCoach = context.getBean("thatSillyCoach", NewCoach.class);
		
		//call method on bean 
		System.out.println(theCoach.getDailyWorkout());
		
		//close context 
		context.close();
	}

}

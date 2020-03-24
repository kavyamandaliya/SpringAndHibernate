package com.learning.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.basics.springin5steps.basics.BinarySearchImpl;
import com.learning.spring.basics.springin5steps.xml.XMLPersonDAO;


public class SpringIn5StepsXMLContextApplication {
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	//what are beans 
	//what are dependencies for the bean 
	//where to search for the beans 
	
	public static void main(String[] args) {
		//application context maintains all the beans 
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		LOGGER.info("beans-> {}", 
				(Object)applicationContext.getBeanDefinitionNames());
		XMLPersonDAO person = applicationContext.getBean(XMLPersonDAO.class);
		
		System.out.println(person);
		System.out.println(person.getXMLJdbcConnection());

		applicationContext.close();
		
	}

}

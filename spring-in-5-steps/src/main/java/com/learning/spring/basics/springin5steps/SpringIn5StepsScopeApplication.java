package com.learning.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learning.spring.basics.springin5steps.basics.BinarySearchImpl;
import com.learning.spring.basics.springin5steps.scope.PersonDAO;

@Configuration
@ComponentScan("com.learning.spring.basics.springin5steps")
public class SpringIn5StepsScopeApplication {
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	//what are beans 
	//what are dependencies for the bean 
	//where to search for the beans 
	
	public static void main(String[] args) {
		//application context maintains all the beans 
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);		PersonDAO person1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO person2 = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}",person1);
		LOGGER.info("{}",person1.getJdbcConnection());
		LOGGER.info("{}",person2);
		LOGGER.info("{}",person2.getJdbcConnection());

		
	}

}

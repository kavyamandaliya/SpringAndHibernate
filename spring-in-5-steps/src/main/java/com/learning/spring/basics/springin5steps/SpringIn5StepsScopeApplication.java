package com.learning.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.spring.basics.springin5steps.basics.BinarySearchImpl;
import com.learning.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	//what are beans 
	//what are dependencies for the bean 
	//where to search for the beans 
	
	public static void main(String[] args) {
		//application context maintains all the beans 
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDAO person1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO person2 = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}",person1);
		LOGGER.info("{}",person1.getJdbcConnection());
		LOGGER.info("{}",person2);
		LOGGER.info("{}",person2.getJdbcConnection());

		
	}

}

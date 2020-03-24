package com.learning.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learning.spring.basics.springin5steps.basics.BinarySearchImpl;
import com.learning.spring.basics.springin5steps.cdi.SomeCDIBusiness;
import com.learning.spring.basics.springin5steps.scope.PersonDAO;

@SuppressWarnings("unused")
@Configuration
@ComponentScan("com.learning.spring.basics.cdi")
public class SpringIn5StepsCDIApplication {
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);
	//what are beans 
	//what are dependencies for the bean 
	//where to search for the beans 
	
	public static void main(String[] args) {
		//application context maintains all the beans 
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsCDIApplication.class);
			SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
		
		LOGGER.info("{}", business);
		

		
	}

}

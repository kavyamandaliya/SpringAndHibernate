package com.learning.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ScopedProxyMode;


public class XMLJdbcConnection {
	public XMLJdbcConnection() {
		System.out.println(" xml JDBC");
	}
}

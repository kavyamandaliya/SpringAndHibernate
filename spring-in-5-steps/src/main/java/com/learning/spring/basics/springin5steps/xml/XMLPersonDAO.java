package com.learning.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.learning.spring.basics.springin5steps.scope.JdbcConnection;


public class XMLPersonDAO {
	
	XMLJdbcConnection xmlJdbcConnection;

	public XMLJdbcConnection getXMLJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXMLJdbcConnection(XMLJdbcConnection jdbcConnection) {
		this.xmlJdbcConnection = jdbcConnection;
	}
	
}

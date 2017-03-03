package com.tutorialspoint.loader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainerLoader {
	protected static ApplicationContext context ;
	
	public ContainerLoader(){
		context = new ClassPathXmlApplicationContext("Beans.xml");
	}

}

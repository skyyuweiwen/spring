package com.tutorialspoint.loader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainerLoader {
	protected ApplicationContext context ;
	
	public ContainerLoader(){
		context = new ClassPathXmlApplicationContext("Beans.xml");
	}

}

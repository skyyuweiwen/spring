package com.tutorialspoint.helloworld;

import org.springframework.context.support.AbstractApplicationContext;

public class SayHello{
	
	public void sayhello(AbstractApplicationContext context) {
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
	}

}

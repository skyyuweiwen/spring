package com.tutorialspoint.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.tutorialspoint.helloworld.HelloWorld;

public class ShowConfig {
	@SuppressWarnings("resource")
	public void showconfig(AbstractApplicationContext context) {
		context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World for configuration!");
		helloWorld.getMessage();
	}
}

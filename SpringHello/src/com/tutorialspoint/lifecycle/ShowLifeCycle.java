package com.tutorialspoint.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.helloworld.HelloWorld;

public class ShowLifeCycle {
	public void showlifecycle(AbstractApplicationContext context) {

		HelloWorld obj = (LifeCycle) context.getBean("lifecycle");
		obj.getMessage();
		context.registerShutdownHook();
	}
}

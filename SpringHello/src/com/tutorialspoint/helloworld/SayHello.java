package com.tutorialspoint.helloworld;

import org.springframework.context.support.AbstractApplicationContext;

public class SayHello {

	public void sayhello(AbstractApplicationContext context) {
		context.start();

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

		context.stop();
	}

}

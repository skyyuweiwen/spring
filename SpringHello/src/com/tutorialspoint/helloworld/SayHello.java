package com.tutorialspoint.helloworld;

import com.tutorialspoint.loader.ContainerLoader;

public class SayHello extends ContainerLoader{
	
	public void sayhello() {
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
	}

}

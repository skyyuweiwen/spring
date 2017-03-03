package com.tutorialspoint.helloscope;

import com.tutorialspoint.helloworld.HelloWorld;
import com.tutorialspoint.loader.ContainerLoader;

public class Scope extends ContainerLoader{

	public void DiffOfScope() {
		HelloWorld obj = (HelloWorld) context.getBean("helloWorldsingleton");
		obj.setMessage("Hello Kitty!!");
		obj.getMessage();
		HelloWorld obj1_1 = (HelloWorld) context.getBean("helloWorldsingleton");
		obj1_1.getMessage();
		HelloWorld obj2 = (HelloWorld) context.getBean("helloWorldpototype");
		obj2.setMessage("Hello Kitty!");
		obj2.getMessage();
		HelloWorld obj2_1 = (HelloWorld) context.getBean("helloWorldpototype");
		obj2_1.getMessage();
	}
}

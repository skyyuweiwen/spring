package com.tutorialspoint.lifecycle;

import com.tutorialspoint.helloworld.HelloWorld;

public class LifeCycle extends HelloWorld{
	
	public void init(){
		System.out.println("Bean is going through init.");
	}

	public void destroy() {
		System.out.println("Bean will destroy now.");
	}
}

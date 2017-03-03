package com.tutorialspoint.lifecycle;

import com.tutorialspoint.helloworld.HelloWorld;

public class LifeCycle extends HelloWorld{
	
	public void init(){
		System.out.println("LifeCycle is going through init.");
	}

	public void destroy() {
		System.out.println("LifeCycle will destroy now.");
	}
}

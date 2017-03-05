package com.tutorialspoint.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.tutorialspoint.helloworld.HelloWorld;

public class LifeCycle extends HelloWorld {
	@PostConstruct
	public void init() {
		System.out.println("LifeCycle is going through init.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("LifeCycle will destroy now.");
	}
}

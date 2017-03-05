package com.tutorialspoint.annotation;

import org.springframework.context.support.AbstractApplicationContext;

public class ShowAnnotation {
	public void showAnnotation(AbstractApplicationContext context) {
		Student student = (Student) context.getBean("student");
		System.out.println("Name : " + student.getName());
		System.out.println("Age : " + student.getAge());
	}
}

package com.tutorialspoint.spinherit;

import org.springframework.context.support.AbstractApplicationContext;

public class ShowInherit {
	public void showinherit(AbstractApplicationContext context){
		Parent parent = (Parent) context.getBean("parent");
		Child child = (Child) context.getBean("child");
		
		parent.getMessage1();
		parent.getMessage2();
		
		child.getMessage1();
		child.getMessage2();
		child.getMessage3();
	}
}

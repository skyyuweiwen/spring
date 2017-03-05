package com.tutorialspoint.di;

import org.springframework.context.support.AbstractApplicationContext;

public class Di {
	public void showdi(AbstractApplicationContext context) {
		//context.getBean("spellChecker");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
		
		JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
		jc.getAddressList();
		jc.getAddressMap();
		jc.getAddressProp();
		jc.getAddressSet();
	}
}

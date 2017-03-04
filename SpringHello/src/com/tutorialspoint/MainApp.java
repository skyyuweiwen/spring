package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.di.Di;
import com.tutorialspoint.helloscope.Scope;
import com.tutorialspoint.helloworld.SayHello;
import com.tutorialspoint.lifecycle.ShowLifeCycle;
import com.tutorialspoint.spinherit.ShowInherit;

public class MainApp {
   public static void main(String[] args) {
	   
	   AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	   
	   SayHello sayhello = new SayHello();
	   sayhello.sayhello(context);
	   
	   Scope scope = new Scope();
	   scope.DiffOfScope(context);
	   
	   ShowLifeCycle lifecycle = new ShowLifeCycle();
	   lifecycle.showlifecycle(context);
	   
	   ShowInherit shouinherit = new ShowInherit();
	   shouinherit.showinherit(context);
	   
	   Di di = new Di();
	   di.showdi(context);
   }
}
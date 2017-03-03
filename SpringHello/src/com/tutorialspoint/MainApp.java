package com.tutorialspoint;

import com.tutorialspoint.helloscope.Scope;
import com.tutorialspoint.helloworld.SayHello;
import com.tutorialspoint.lifecycle.ShowLifeCycle;

public class MainApp {
   public static void main(String[] args) {
	   
	   SayHello sayhello = new SayHello();
	   sayhello.sayhello();
	   
	   Scope scope = new Scope();
	   scope.DiffOfScope();
	   
	   ShowLifeCycle lifecycle = new ShowLifeCycle();
	   lifecycle.showlifecycle();
	   
   }
}
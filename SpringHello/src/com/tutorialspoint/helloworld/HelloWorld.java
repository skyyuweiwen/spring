package com.tutorialspoint.helloworld;

public class HelloWorld {
   protected String message;
   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}
package com.tutorialspoint.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorialspoint.helloworld.HelloWorld;

@Configuration
public class HelloWorldConfig {
	   @Bean 
	   public HelloWorld helloWorld(){
	      return new HelloWorld();
	   }
}

package com.nijamrit.SpringBootPlay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootPlayApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootPlayApplication.class, args); // It returns the container created by Spring
		System.out.println("=================================== After Starting Spring ===================================");
		
		// IoC (Inversion of Control (Principle) is achieved by Dependency Injection (Design Pattern))
		context.getBean(Dev.class).build(); // can get the object of class that has created bean, by annotating class with @Component
		System.out.println("After Spring Application...");
	}

}

package com.iocdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//retrieve bean from spring container
		Coach coach=context.getBean("myCoach",Coach.class);
		
		Coach coach1=context.getBean("myCoach",Coach.class);
		
		
		//check  if they are the same
		
		boolean result =(coach==coach1);
		
		System.out.println("\nPointing to the same object: " +result ); //prints classname and memory address
		
		System.out.println("\n Memory location for the coach: " +coach);
		
		System.out.println("\n Memory location for the coach: " +coach1);
		
		
		//close the context
		context.close();
		
		
		
		

	}

}

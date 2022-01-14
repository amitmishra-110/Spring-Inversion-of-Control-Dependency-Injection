package com.iocdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/*This is a main class*/
public class HelloSpringApp {

	public static void main(String[] args) {
	
		
		//load spring configuration file
		ClassPathXmlApplicationContext context=new
		ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean from spring container
		//creating object of interface with help of implementation class
		Coach baseballcoach=context.getBean("myCoach",Coach.class);
		
		//call methods  on bean
		
		System.out.println(baseballcoach.getDailyWorkout());
		
		//close the context
		context.close();
		
		
		//use method to call dependency class methods
		System.out.println(baseballcoach.getDailyFortune());

	}

}

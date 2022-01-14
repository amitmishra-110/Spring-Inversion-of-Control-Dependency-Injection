package com.iocdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoMainApp {

	public static void main(String[] args) {
	
		
		//Load spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve  bean from spring container
		
		/*Here instead of creating reference object of Coach interface we created of CricketCoach class
		is because coach interface will have access to only 2 methods while cricket class 4 methods
		including getName & getEmail */
		
		 CricketCoach cricketCoach=context.getBean("myCricketCoach",CricketCoach.class);
		
		
		//call methods of bean
		System.out.println(cricketCoach.getDailyWorkout());
		
		//call to setter inject using literal
		System.out.println(cricketCoach.getName());
		System.out.println(cricketCoach.getEmail());
		
		//close the context

		 context.close();
	}

}

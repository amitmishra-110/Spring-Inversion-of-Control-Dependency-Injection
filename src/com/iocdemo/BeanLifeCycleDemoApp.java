package com.iocdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		
		//retrieve bean from spring container
		Coach coach=context.getBean("myCoach",Coach.class);
		
		//Spring call by default init method and destroy method so we can add hooks here 
		System.out.println("Bean lifecycle method will also be called"+ coach.getDailyWorkout());
		
		//Note: Prototype bean does not call the destroy method!!!
					//Output
		
		/*
				BaseBallCoach: Inside method doMyStartupStuff
				Bean lifecycle method will also be calledPractice battinng for 10 mins
				BaseBallCoach: Inside method doMyDestroyStuff
		 */

		

		
		//close the context
		context.close();
		
		
		
		

	}

}

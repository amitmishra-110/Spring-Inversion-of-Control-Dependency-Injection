package com.iocdemo;

public class BaseballCoach implements Coach {
	
	//defining a variable for Interface to assign dependency
	private FortuneService fortuneService;
	
	
	//define a constructor to accept dependency inject
	public BaseballCoach(FortuneService thefortuneService)
	{
		fortuneService=thefortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Practice battinng for 10 mins";
	}

	
	
	
	@Override
	public String getDailyFortune() {
		// use fortuneService interface object to get method of helper(dependency) class
		return fortuneService.getFortune();
	}
	
	
	
	
	
	
	/*-----------------------For BeanLifeCyle Methods --------------------------------*/
	
	// add a init method
	public void doMyStartupStuff()
	{
		System.out.println("BaseBallCoach: Inside method doMyStartupStuff");
	}
	
	
	//add a  destroy method
	public void doMyDestroyStuff()
	{
		System.out.println("BaseBallCoach: Inside method doMyDestroyStuff");
	}
	
	
	
	
	
	
	
	
	

}

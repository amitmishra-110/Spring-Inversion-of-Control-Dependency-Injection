package com.iocdemo;

public class CricketCoach implements Coach {
	
	//adding new variables email address and team for setter literal injection
	
	private String email;
	private String name;
	
	
	
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		
		System.out.println("Inside  setter method- set Email Address");
		this.email = email;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		
		System.out.println("Inside  setter method- set Name");
		this.name = name;
	}

	private FortuneService fortuneService;
	
	public CricketCoach()
	{
		System.out.println("Inside constructor");
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println("Inside  setter method-setFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling or 15mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

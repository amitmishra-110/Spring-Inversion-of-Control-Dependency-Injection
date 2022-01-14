package com.iocdemo;

public interface Coach {
	
	public String getDailyWorkout();
	
	//now coach will also provide daily fortune with help of dependency class
	
	public String getDailyFortune();

}

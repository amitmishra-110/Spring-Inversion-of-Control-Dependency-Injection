package com.iocdemo;

public class MyFortune implements FortuneService {

	@Override
	public String getFortune() 
	{
	
		return  "This is dependecy class providing fortune service to baseball coach";
	}

}

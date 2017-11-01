package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach 
{
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// Constructor Injection
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) 
	{
		fortuneService = theFortuneService;
	}
	*/
	
	public TennisCoach() 
	{
		System.out.println("Inside the Default Tennis Coach Constructor");
	}

	@Override
	public String getDailyWorkout() 
	{
		return "You need to practice tennis for 30 minutes a day!!";
	}
	
	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}

	// Setter Injection
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) 
	{
		System.out.println("Inside the Default Tennis Coach Constructor");
		this.fortuneService = fortuneService;
	}*/
	
	// Method Injection
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) 
	{
		System.out.println("Inside the doSomeCrazyStuff Method");
		this.fortuneService = fortuneService;
	}*/
	
	// Define my init method
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("TennisCoach : Inside the doMyStartupStuff method");
	}
	
	// Define my destroy method
	@PreDestroy
	public void doMyDestroyStuff()
	{
		System.out.println("TennisCoach : Inside the doMyDestroyStuff method");
	}
}

package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp 
{
	public static void main(String[] args) 
	{
		// Read Spring Configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call methods on the bean
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getTeam());
		
		// close the context
		context.close();
	}
}

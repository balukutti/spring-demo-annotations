package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp 
{
	public static void main(String[] args) 
	{
		// Read Spring Configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}

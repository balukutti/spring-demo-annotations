package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp 
{

	public static void main(String[] args) 
	{
		// Read Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from the spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}

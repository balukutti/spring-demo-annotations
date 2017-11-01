package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp 
{
	
	public static void main(String args[]) 
	{
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// CHeck if they are same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nAre the objects Same : " + result);
		
		System.out.println("\nMemory location for theCoach :" + theCoach);
		System.out.println("\nMemory location for alphaCoach :" + alphaCoach);
			
		// close the context
		context.close();
	}

}

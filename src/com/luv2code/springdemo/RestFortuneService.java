package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getFortune() 
	{
		return "This is your Rest Fortune Service!!";
	}

}

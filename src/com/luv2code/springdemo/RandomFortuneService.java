package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService 
{
	// create a array of String
	private String [] data = {
			"Beware of wolf",
			"Good Luck Man!!",
			"Journey is the reward"
	};
	
	// Create random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() 
	{
		// pick a random fortune from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}

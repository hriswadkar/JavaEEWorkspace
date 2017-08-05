package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create the object
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container
		BaseballCoach theCoach = context.getBean("myBaseballCoach", BaseballCoach.class);		
			
		// Use the object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	}

}

package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopePracticeActivityApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScopePracticeActivity-applicationContext.xml");
		
		// Retrieve bean from spring container
		BaseballCoach theCoach = context.getBean("myBaseballCoach", BaseballCoach.class);		
			
		// Use the object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call method on the bean
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		
		
		System.out.println("\nMemory location for the coach " + theCoach.toString());
		System.out.println("\nMemory location for the coach " + cricketCoach.toString());
		
		context.close();
	}

}

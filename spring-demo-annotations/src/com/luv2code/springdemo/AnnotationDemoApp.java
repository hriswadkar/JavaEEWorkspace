package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		Coach karateCoach = context.getBean("karateCoach", Coach.class);
		System.out.println(karateCoach.getDailyWorkout());
		
		Coach tennisCoachSetterInjection = context.getBean("tennisCoachSetterInjection", Coach.class);
		System.out.println(tennisCoachSetterInjection.getDailyWorkout());
		System.out.println(tennisCoachSetterInjection.getDailyFortune());
		
		Coach tennisCoachFieldInjection = context.getBean("tennisCoachFieldInjection", Coach.class);
		System.out.println(tennisCoachFieldInjection.getDailyWorkout());
		System.out.println(tennisCoachFieldInjection.getDailyFortune());
		
		// close the context
		context.close();

	}

}

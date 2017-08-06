package com.spring.demo.practice5;

import javax.naming.Context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneFromFileDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
	}

}

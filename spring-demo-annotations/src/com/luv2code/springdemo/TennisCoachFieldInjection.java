package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachFieldInjection implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoachFieldInjection() {
		System.out.println(">> Inside default constructor of TennisCoachFieldInjection");
	}
	
	// define a setter method
	/*@Autowired
	public void someMethodOfClass(FortuneService theFortuneService) {
		System.out.println(">> Inside setFortuneService method of class TennisCoachSetterInjection");
		fortuneService = theFortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley again TennisCoachFieldInjection";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortue();
	}
}

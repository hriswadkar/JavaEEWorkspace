package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachSetterInjection implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoachSetterInjection() {
		System.out.println(">> Inside default constructor of TennisCoachSetterInjection");
	}
	
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> Inside setFortuneService method of class TennisCoachSetterInjection");
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley again";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortue();
	}
}

package com.spring.demo.practice5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice your back hand volley";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortue();
	}

}

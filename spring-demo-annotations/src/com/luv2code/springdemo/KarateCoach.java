package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

// This class is added as part of practice activity 4
@Component
public class KarateCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice kicks and katas for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "";
	}

}

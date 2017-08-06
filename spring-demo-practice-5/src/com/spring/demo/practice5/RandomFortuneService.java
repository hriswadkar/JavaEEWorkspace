package com.spring.demo.practice5;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	@Value("${Fortune1}")
	private String fortune1;
	
	@Value("${Fortune2}")
	private String fortune2;
	
	@Value("${Fortune3}")
	private String fortune3;
	
	public RandomFortuneService() {
		
	}

	@Override
	public String getDailyFortue() {
		String[] randomFortune = {fortune1, fortune2, fortune3};
		Random myRandom = new Random();
		int randomNum = myRandom.nextInt(randomFortune.length);		
				
		return randomFortune[randomNum];
	}

}

package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getDailyFortue() {
		String[] randomFortune = new String[3];
		randomFortune[0] = "Beware of the wolf in sheep's clothing";
		randomFortune[1] = "Diligence is the mother of good luck";
		randomFortune[2] = "The journey is the reward";
		
		Random myRandom = new Random();
		int randomNum = myRandom.nextInt(randomFortune.length);
		System.out.println("Random Number is: " + randomNum);
		return randomFortune[randomNum];
	}

}

package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getDailyFortue() {
		// TODO Auto-generated method stub
		return "This is your fortune from REST Service";
	}

}

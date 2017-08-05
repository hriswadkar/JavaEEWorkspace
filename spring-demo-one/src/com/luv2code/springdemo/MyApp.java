package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create the object
		FortuneService fortuneService = null;
		Coach theCoach = new BaseballCoach(fortuneService);
		
		// Use the object
		System.out.println(theCoach.getDailyWorkout());
		
		Coach theCoach2 = new TrackCoach();
		
		System.out.println(theCoach2.getDailyWorkout());
	}

}

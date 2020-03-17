package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Running 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it " +fortuneService.getFortune();
	}

	
}

package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements NewCoach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do tennis";
	}

}

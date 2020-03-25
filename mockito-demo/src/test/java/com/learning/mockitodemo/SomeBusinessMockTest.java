package com.learning.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {

	@Test
	void findTheGreatestFromAllDataTest() {
		SomeBusinessImpl business = 
				new SomeBusinessImpl(new DataServiceStub());
		int result = business.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[]{24,6,15};
	}
	
}

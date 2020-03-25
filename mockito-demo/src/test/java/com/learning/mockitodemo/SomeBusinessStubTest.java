package com.learning.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessStubTest {

	@Test
	void findTheGreatestFromAllDataTest() {
		DataService mock1 = mock(DataService.class);
		 		
		when(mock1.retrieveAllData()).thenReturn(new int[] {24,15,3});
		SomeBusinessImpl business = 
				new SomeBusinessImpl(mock1);
		int result = business.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

	@Test
	void findTheGreatestFromAllDataTest_forOneValue() {
		DataService mock1 = mock(DataService.class);
		 		
		when(mock1.retrieveAllData()).thenReturn(new int[] {15});
		SomeBusinessImpl business = 
				new SomeBusinessImpl(mock1);
		int result = business.findTheGreatestFromAllData();
		assertEquals(15, result);
	}

}

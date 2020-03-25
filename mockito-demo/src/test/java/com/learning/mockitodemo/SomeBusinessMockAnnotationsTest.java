package com.learning.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
class SomeBusinessMockAnnotationsTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl business;
	  
	@Test
	void findTheGreatestFromAllDataTest() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		int result = business.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

	@Test
	void findTheGreatestFromAllDataTest_forOneValue() {
	
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		int result = business.findTheGreatestFromAllData();
 		assertEquals(15, result);
	}

}

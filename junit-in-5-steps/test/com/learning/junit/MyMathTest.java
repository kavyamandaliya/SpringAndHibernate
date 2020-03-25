package com.learning.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();
	
	@Before
	 void before() {
		System.out.println("Before");

	}

	@Test
	void sum1() {
		//absence of failure is success 
		
		int result = myMath.sum(new int[] {1,2,3});
//		System.out.println(result);
		assertEquals(6, result); 
		
	}
	
	@Test
	void sum2() {
		//absence of failure is success 
		int result = myMath.sum(new int[] {3});
//		System.out.println(result);
		assertEquals(3, result); 
		
	}
	
	@Test
	void sum3() {
		//absence of failure is success 
		int result = myMath.sum(new int[] {});
//		System.out.println(result);
		assertEquals(0, result); 
		
	}
	
	
}

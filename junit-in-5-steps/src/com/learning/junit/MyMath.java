package com.learning.junit;

public class MyMath {
	
	int sum(int arr[]) {
		int sum = 0;
		for(int i: arr) {
			sum += i;
		}
		return sum;
	}
}

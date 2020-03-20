package com.learning.spring.basics.springin5steps;

public class BinarySearchImpl {
	//sorting an array 
	//search the array 
	//return the result index 
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int target) {		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return -1;
	}
	
}

package com.ForLoop;
//Find the sum of the first 100 natural numbers.

public class SumOfNaturalNo {
	
	int sum = 0 ; 
	public void sumOfNum() {
		for(int i = 0 ; i<=100 ; i++) {
			sum = sum + i ;
		}
		System.out.println("Sum of natural numbers : " +sum );
	}
	
	public static void main(String[] args) {
		SumOfNaturalNo n = new SumOfNaturalNo();
		n.sumOfNum();
		
	}

}

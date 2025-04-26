package com.ForLoop;
//Print all numbers divisible by 5 between 1 and 100.

public class DivisibleBy5 {
	
	public void CheckDivisiblity() {
		for(int i = 0 ; i <= 100 ; i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		DivisibleBy5 d = new DivisibleBy5();
		d.CheckDivisiblity();
		
	}

}

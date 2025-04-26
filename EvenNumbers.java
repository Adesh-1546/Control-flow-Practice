package com.ForLoop;
//Print numbers from 1 to 10.



public class EvenNumbers {
	public void printEvenNum() {
		for(int i = 0 ; i<=50 ; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		EvenNumbers en = new EvenNumbers();
		en.printEvenNum();
		
	}

}

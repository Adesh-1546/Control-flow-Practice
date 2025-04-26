package com.ForLoop;
//Print numbers from 1 to 10.



public class Numbers {
	public void printNumbers() {
		for (int i = 1 ; i<= 10 ; i++) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		Numbers n = new Numbers();
		n.printNumbers();
	
	}

}

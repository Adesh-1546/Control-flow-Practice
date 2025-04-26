package com.ForLoop;

public class PrimeNum1_100 {
	int num;
	
	public void primeNum() {
		
		
		for ( num = 2 ; num<=100 ; num++) {
			boolean isPrime = true ; 
			
			for(int i = 2 ; i <= num /2 ; i++) {
				if (num % i == 0 ) {
					isPrime = false ;
					break;
				}
				
				
			}
			if (isPrime) {
				System.out.print(num+ " ");
			}
		
		}
		
		
	}
	
	public static void main(String[] args) {
		PrimeNum1_100 p = new PrimeNum1_100();
		p.primeNum();
		
	}

}

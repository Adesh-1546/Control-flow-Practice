package com.ForLoop;
import java.util.Scanner;

public class PrimeNumberScanner {
	
	int num; 
	public PrimeNumberScanner(int num) {
		this.num = num ;
	}
	
	public void CheckPrime() {
		boolean isPrime = true ; 
		
		if (num < 2) {
			isPrime = false;
		}else {
			for (int i = 2 ; i <= num /2 ; i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}
		}
		
		if (isPrime) {
			System.out.println(num+ " is Prime Number");
		}else {
			System.out.println(num+ " is not a Prime Number");
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		PrimeNumberScanner p = new PrimeNumberScanner(num);
		p.CheckPrime();
		sc.close();
		
		}

		
}



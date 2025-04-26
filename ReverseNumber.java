package com.ForLoop;
import java.util.Scanner;

//Reverse a given number.
//(Example: Input: 1234, Output: 4321)

public class ReverseNumber {
	int num;
	public ReverseNumber(int num) {
		this.num=num;
	}
	int reverse = 0 ; 
	
	public void doReverse() {
		while(num!=0) {
			int digit = num % 10 ;              //Step 1 : get last digit
			reverse = reverse *10 + digit ;     //Step 2 : append digit
			num = num/10;                       //Step 3 : Remove last digit
			
		}
		System.out.println(reverse);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		ReverseNumber r = new ReverseNumber(num);
		r.doReverse();
		sc.close();
	}

}

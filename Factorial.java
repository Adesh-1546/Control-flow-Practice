package com.ForLoop;
import java.util.Scanner;
//Calculate the factorial of a given number.
//(Example: 5! = 5 × 4 × 3 × 2 × 1 = 120)

public class Factorial {
	int num;
	int factorial = 1;              // Use long to handle large results
	
	public Factorial(int num) {     // constructor
		this.num = num;
	}
	
	public void CheckFactorial() {      //method 
		for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
		System.out.println(factorial);
		
	}
	
	public static void main(String[] args) {       //main method 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		Factorial f = new Factorial(num);
		f.CheckFactorial();
		sc.close();
	}

}

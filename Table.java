package com.ForLoop;
import java.util.Scanner;
//Print the multiplication table of a given number (e.g., 7 × 1 = 7, ... 7 × 10 = 70).

public class Table {
	int num;
	
	public Table(int num) {          //constructor
		this.num = num;
	}
	
	public void printTable() {             //method
		for(int i = 1 ; i <=10 ; i++) {
			System.out.println(num+ " * " +i+ " = "+num*i);
		}
	}
	
	public static void main(String[] args) {          //main method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		Table t = new Table(num);
		t.printTable();
		sc.close();
		
	}

}

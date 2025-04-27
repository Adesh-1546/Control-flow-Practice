package com.ForLoop;
import java.util.Scanner ; 

//Count how many vowels and consonants are present in a string.

public class VowelCheck {
	String s ; 
	public VowelCheck(String s) {
		this.s=s;
	}
	
	int Vowels = 0 ;
	int Consonants = 0 ; 
	
	public void CheckVowels() {
		s = s.toLowerCase();                    // Change to LowerCase
		for(int i = 0 ; i < s.length() ; i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <='z' ) {
				if (ch=='a' || ch =='e'|| ch =='i'||ch =='o'||ch =='u') {
					Vowels = Vowels + 1 ; 
				}else {
					Consonants = Consonants + 1 ; 
				}
				
				
			}
		}
		System.out.println("Vowels : "+Vowels);
		System.out.println("Consonants : "+Consonants);
	}
	
	

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		VowelCheck v = new VowelCheck(s);
		v.CheckVowels();
		sc.close();
		
		
	}


}

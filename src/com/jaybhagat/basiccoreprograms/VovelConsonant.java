package com.jaybhagat.basiccoreprograms;

/**
 * class to get alphabet and find out if it's Vowel or Consonant
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class VovelConsonant {
	public static void main(String[] args) {
		
		// input
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter an Alphabet : ");
	    char c = scanner.next().charAt(0);
	    scanner.close();
	        
	    // logic
	    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' )
	    	System.out.println(c + " is Vowel");
	    else
	    	System.out.println(c + " is Consonant");
	}
}
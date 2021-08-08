package com.jaybhagat.basiccoreprograms;

/**
 * class to get number input and find out if it's Even or Odd
 * @author com.bridgelabz
 */

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		// Taking input
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a Number: ");
	    int inputNumber = scanner.nextInt();
	    scanner.close();
	    
	    // logic
	    if (inputNumber % 2 == 0) {
	    	System.out.println(inputNumber + " is Even Number");
	    }
	    else {
	    	System.out.println(inputNumber + " is Odd Number");
	    }
	}
}
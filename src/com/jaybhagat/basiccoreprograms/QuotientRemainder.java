package com.jaybhagat.basiccoreprograms;

/**
 * class to get dividend and divisor from user and find Quotient and Remainder 
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		
		// taking input from user
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Dividend Number: ");
        int inputDividend = scanner.nextInt();
        System.out.print("Enter The Divisor: ");
        int inputDivisor = scanner.nextInt();
        scanner.close();
        
        // logic to find quotient and remainder
        int findQuotient = inputDividend / inputDivisor;
        int findRemainder = inputDividend % inputDivisor;
        
        System.out.println("Quotient: " + findQuotient);
        System.out.println("Remainder: " + findRemainder);
	}
}
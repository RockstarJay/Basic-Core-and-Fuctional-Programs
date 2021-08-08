package com.jaybhagat.basiccoreprograms;

/**
 * class to get three integer as input and find out which is largest
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		
		// inputs
		Scanner scanner = new Scanner(System.in);
        System.out.print("Please input 3 integers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        scanner.close();
        
        // logic
        int largestNumber = Math.max(Math.max(firstNumber,secondNumber),thirdNumber);
        System.out.println(largestNumber+ " is the Largest");
	}
}
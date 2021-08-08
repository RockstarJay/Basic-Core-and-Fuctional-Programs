package com.jaybhagat.basiccoreprograms;

/**
 * class to find the harmonic number of a number
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		
		// taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number to Find it's Harmonic Number : ");
		int inputNumber = scanner.nextInt();
		scanner.close();
		getHarmonicNumber(inputNumber);  // function call
	}
	
	/*
	 * get the input from the user
	 * validate that the number is not less or equal to zero
	 * find the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
	 * print the Nth harmonic Value.
	 */
	public static void getHarmonicNumber(int inputNumber) {
		double harmonicNumber = 0;
		if (inputNumber > 0){
			for (int i = 1; i <= inputNumber; i++){
				harmonicNumber += (1.0 / i);
			}
			System.out.printf("Harmonic Number is : %.4f ",harmonicNumber);
		} 
		else
			System.out.println("Number Should be Graeter Than 0");
	}
}
package com.jaybhagat.basiccoreprograms;

/**
 * class to find the powers of 2 that are less than or equal to input number
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		
		// taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int inputNumber = scanner.nextInt();
		scanner.close();
		getPower(inputNumber);
	}
	
	/*
	 * get a number as a input from the user
	 * print a table of the powers of 2 that are less than or equal to 2^inputNumber.
	 */
	public static void getPower(int inputNumber) {
		int powerOfTwo = 1;
		if (inputNumber > 0 && inputNumber < 31){
			for (int i = 1; i <= inputNumber; i++){
				powerOfTwo = powerOfTwo * 2;
				System.out.println(2 + " to the Power " +i+ " : "+ powerOfTwo);
			}
		}
		else
			System.out.println("Your Input Overflows the 'int' datatype Limit");
	}
}
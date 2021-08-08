package com.jaybhagat.basiccoreprograms;

/*
 * class to find if the year is leap year or not
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
		
	// taking input from user
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter Year to check if it's a Leap Year : ");
	int checkYear = scanner.nextInt();
	scanner.close();
	
	// validating if entered year is in 4 digit
	if (checkYear >= 999)
		getLeapYear(checkYear);
	else
		System.out.println("Plase Enter Year in 4 Digits");	
	}

	/*
	 * function to get if entered year is leap year or not
	 * get year as parameter to to function
	 * check the leap year conditions
	 * print the result to the console
	 */
	public static void getLeapYear(int checkYear) {
		if ((checkYear %4 == 0 && checkYear %100 != 0) || checkYear%400 == 0 ) {
			System.out.println(checkYear+ " is a Leap Year");
		}
		else
			System.out.println(checkYear+ " is Not a Leap Year");
	}
}
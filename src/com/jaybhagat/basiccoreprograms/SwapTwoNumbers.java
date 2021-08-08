package com.jaybhagat.basiccoreprograms;

/**
 * class to get two numbers from user and then swap them using temporary variable
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class SwapTwoNumbers {
public static void main(String[] args) {
		
		// taking inputs from user
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = scanner.nextInt();
        scanner.close();
        int temp;
        
        // before swap
        System.out.println("Numbers Before Swapping");
        System.out.println("First Number : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);
        
        // logic
        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("Numbers After Swapping");
        System.out.println("First Number : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);
	}
}
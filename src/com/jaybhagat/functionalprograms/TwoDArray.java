package com.jaybhagat.functionalprograms;

/**
 * class to show A library for reading in 2D arrays of integers standard input and printing them to standard output.
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class TwoDArray {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		// input array column and row sizes
        System.out.print("Enter The Row Size : ");
        int arrayRowSize = scanner.nextInt();
        System.out.print("Enter The Column Size : ");
        int arrayColumnSize = scanner.nextInt();

        printArray(arrayRowSize, arrayColumnSize);   // function call
	}
	
	/*
	 * get column and row size from user 
	 * ask user to enter the elements to the position in the  two dimensional array
	 * the print the array
	 */
	public static void printArray(int arrayRowSize, int arrayColumnSize) {
		int[][] twoDArray = new int[arrayRowSize][arrayColumnSize];
	        
        // input array elements
        for (int i=0; i<arrayRowSize; i++) {
            for (int j=0; j<arrayColumnSize; j++) {
                System.out.print("Enter The Value at: "+i+ " "+j +" : ");
                twoDArray[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        
        // printing array
        for (int i=0; i<arrayRowSize; i++) {
            for (int j=0; j<arrayColumnSize; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println("\n");
        }
	}
	
}
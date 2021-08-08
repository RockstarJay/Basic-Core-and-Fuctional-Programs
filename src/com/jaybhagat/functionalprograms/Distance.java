package com.jaybhagat.functionalprograms;

/**
 * class to take x and y co-ordinate of line and find the Euclidean Distance
 * @author com.jaybhagat
 *
 */

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
		// taking input from the user
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x co-ordinate Value: ");
        int x = scanner.nextInt();
        System.out.print("Enter y co-ordinate Value: ");
        int y = scanner.nextInt();
        scanner.close();
        
        // formula
        double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.printf("Euclidean Distance is: %.2f", distance);   // %.2f is for to print only two digits after point
	}
}
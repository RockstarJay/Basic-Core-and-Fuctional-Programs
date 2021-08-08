package com.jaybhagat.functionalprograms;

/**
 * class to find the wind chill from temperature t (in Fahrenheit) and the wind speed v (in miles per hour).
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		
		// taking inputs from user
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit : ");
        double t = scanner.nextDouble();
        System.out.print("Enter a Wind Speed in Miles Per Hour : ");
        double v = scanner.nextDouble();
        scanner.close();
        
        // calculations and printing
        double windChill = 35.74 + (0.6215 * t) + ((0.4275 * t - 35.75) * (Math.pow(v, 0.16)));
        System.out.printf("Wind Chill is : %.2f", windChill);
	}
}
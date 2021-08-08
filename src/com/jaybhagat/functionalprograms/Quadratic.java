package com.jaybhagat.functionalprograms;

/**
 * class to solve the Quadratic equation from it's a,b and c coefficient values
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// taking inputs from user
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        scanner.close();
        
        // calculations
        double deltaValue = (b*b) - (4.0*a*c);
        System.out.println("Delta Value : " + deltaValue);

        double root1Value = (-b + Math.sqrt(deltaValue)) / (2*a); //root1
        System.out.printf("Root 1 : %.2f ", root1Value);
        double root2Value = (-b - Math.sqrt(deltaValue)) / (2*a); //root2
        System.out.printf("\nRoot 2 : %.2f ", root2Value);
	}
}
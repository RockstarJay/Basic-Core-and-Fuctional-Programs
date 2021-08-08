package com.jaybhagat.basiccoreprograms;

/**
 * class to find all prime factors of a number
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		
		// taking input from user
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Integer to Find It's Prime Factors: ");
        int inputNumber = scanner.nextInt();
        scanner.close();
        getPrimeFactors(inputNumber);   // function call
	}
	
	/*
	 * get a number as a input from the user
	 * find out if the number is prime if yes print number itself and 1 as factors
	 * if not prime find the factors of that number
	 * find out if the factors of that number are prime or not
	 * finally print the prime factors
	 */
	public static void getPrimeFactors(int inputNumber) {
		int flag = 0;
        int check = 0;
        int findFactor = 0;
   
        for (int i = 2; i <= inputNumber / 2; i++){
            if (inputNumber % i == 0){
            	findFactor = i;
                for(int j = 2; j <= findFactor / 2; j++){
                    if (findFactor % j == 0){
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0){
                    System.out.println(findFactor);
                    check = 1;
                }
            }
        }
        if(check == 0)
            System.out.println("No Prime Factor Found Except 1 and " +inputNumber);
	}
}
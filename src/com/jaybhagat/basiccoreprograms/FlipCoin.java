package com.jaybhagat.basiccoreprograms;

/*
 * class to find the percentage of head vs tails in coin flip 
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
		// taking input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("How Many Times You Want to Flip the Coin : ");
		int coinFlip = scanner.nextInt();
		scanner.close();
		getPercentage(coinFlip);
	}
	
	/*
	 * function to calculate the percentage of head vs tails
	 * get the parameter to flip the coin
	 * with the random function find out how many are heads and tails
	 * calculate the percentage of them
	 * print the percentage on the console 
	 */
	public static void getPercentage(int coinFlip) {
		if (coinFlip > 0){
			int headCount = 0;
			int tailCount = 0; 
			for (int i = 0; i < coinFlip; i++){
				double randomNumber = Math.random();
				if (randomNumber < 0.5)
					headCount ++;
			}
			System.out.println("Head Count : " +headCount);
			tailCount = coinFlip - headCount;
			System.out.println("Tail Count : " +tailCount);
			double headPercentage = (headCount * 100.0) / coinFlip;
			double tailPercentage = 100 - headPercentage;
			System.out.println("Head Percentage : " +headPercentage);
			System.out.println("Tail Percentage : " +tailPercentage);
		}
		else
			System.err.println("Please Enter Positive Number");
	}
}
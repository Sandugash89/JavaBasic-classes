package com.syntax.homework;

import java.util.Scanner;

public class Class04Hw06 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		Scanner job = new Scanner(System.in);
		
		System.out.println("Please, enter number of worked years");
		
		int year = job.nextInt();
		
		System.out.println("Please, enter you salary");
		
		int salary = job.nextInt();
		
		if (year >= 5) {
			System.out.println("You are eligible for the bonus");
			
			if (salary > 50000) {
				System.out.println("Your bonus are 5000");
			} else {
				System.out.println("Your bonus are 3000");
			}

		} else {
			System.out.println("You are not eligible for the bonus");

		}
	}
}

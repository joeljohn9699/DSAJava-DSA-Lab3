package com.balancingbrackets.driver;

import java.util.Scanner;

import com.balancingbrackets.service.BracketFinder;

public class Main {

	public static void main(String[] args) {

		String input = "";
		Scanner in = new Scanner(System.in);
		BracketFinder bf = new BracketFinder();

		System.out.println("Enter the Equation");
		input = in.next();

		if (input.length() % 2 != 0) {
			System.out.println("INVALID STATEMENT!!");

		} else {
			if (bf.FindingBrackets(input)) {
				System.out.println("The entered String has Balanced Brackets");

			} else {

				System.out.println("The entered Strings do not contain Balanced Brackets");

			}
		}
		in.close();
	}
}

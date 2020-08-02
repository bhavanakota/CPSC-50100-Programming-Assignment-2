/* CPSC 50100 - Programming Fundamentals 
 * Bhavana Kota
 * Summer II 2020
 * Programming Assignment 2
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Figures {

	public static void main(String[] args) {

		// Printing out identifying information
		System.out.print("Programming Fundamentals\n" + "Name: Bhavana Kota\n" + "PROGRAMMING ASSIGNMENT 2\n");

		System.out.println("\n");

		Scanner scan = new Scanner(System.in);

		int size;
		int option = 0;

		System.out.print("Enter the size of the figure (odd number): ");
		size = scan.nextInt();

		// This checks for an odd number and prints an error if an even number is
		// entered.
		while (size % 2 == 0 || size < 0) {
			System.out.println("Invalid figure size - must be an odd number");
			System.out.print("\n");
			System.out.print("Reenter the size of the figure: ");
			size = scan.nextInt();
		}
		System.out.print("\n");

		// Printing out the menu to pick from in a while loop. Prepping the loop to exit
		// if option 4 is entered.

		while (option != 4) {

			System.out.print("\n");
			System.out
					.print("Menu\n" + "1. Print box\n" + "2. Print diamond\n" + "3. Print X \n" + "4. Quit program\n");
			System.out.print("\n");
			System.out.print("Please select an option: ");
			option = scan.nextInt();

			if (option == 1) {
				System.out.println("\n");
				printBox(size);
			}
			if (option == 2) {
				System.out.println("\n");
				printDiamond(size);
			}
			if (option == 3) {
				System.out.println("\n");
				printX(size);
			}
			if (option == 4) {
				System.out.println("\n");
				System.out.println("Good bye! ");
				System.exit(0);
			}
		}
		scan.close();
	}

	// Creating the box shape
	public static void printBox(int size) {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}

	// Creating the diamond shape
	public static void printDiamond(int size) {

		int position1 = (int) Math.floor(size / 2);
		int position2 = position1 + 1;
		int lineCount = 0;
		int middle = (int) (size + 1) / 2;

		for (int row = 0; row < size; row++) {
			String output = " ";
			for (int column = 0; column <= size + 1; column++) {
				if (column != position1 && column != position2) {
					output += " ";
				}
				if (column == position1 || column == position2) {
					output += "X";
				}
			}
			System.out.println(output);

			lineCount += 1;
			if (lineCount >= middle) {
				position1 += 1;
				position2 -= 1;
			}
			if (lineCount < middle) {
				position1 -= 1;
				position2 += 1;
			}
		}
	}
	
	// Creating the X shape
	public static void printX(int size) {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j || i + j == (size - 1)) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

package chapter2;
/*Christopher S Lynn
 * Chapter 2
 * Programming Challenge 9 pg. 124-125
 * This program calculates the miles per gallon from entry prompts
 */

import java.util.Scanner;  //This is needed for the Scanner inputs

public class MilesPerGallon {		//This defines the class

	public static void main(String[] args) {		//Defines the method
		
		double milesDriven; //Placeholder for input of miles
		double fuelUsed; 	//Placeholder for input of fuel gallons
		double MPG;			//Placeholder to calculate miles per gallon
		
		//Create the Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Asks the user for the miles driven
		System.out.print("Enter the miles driven: ");
		milesDriven = keyboard.nextDouble();
		
		//Asks the user for the fuel used
		System.out.print("Enter the gallons of fuel used: ");
		fuelUsed = keyboard.nextDouble();
		
		//Clear the keyboard newline buffer
		keyboard.nextLine();
		
		//Calculate the miles per gallon
		MPG = milesDriven / fuelUsed;
		System.out.println("The miles-per-gallon is " + MPG);

		//Close out the keyboard input to avoid resource leaks
		keyboard.close();
	}

}

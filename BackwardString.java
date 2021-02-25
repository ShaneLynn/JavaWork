package chapter8;
/*Christopher S Lynn
 * Chapter 8
 * Programming Challenge 1, Backward String (p. 595)
 * This program accepts a string from a user and displays it in reverse
 */

//Setup the scanner utility to be used for user input
import java.util.Scanner;

//The main program class
public class BackwardString {

	public static void main(String[] args) {
		
		//Setup and initialize the variable to hold the user's input.
		String userInput = "";
		
		//Setup the extra class to hold the reverse loop methods
		Reversal backwards = new Reversal();
		
		
		//Setup the user input for the keyboard.
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt the user for data entry
		System.out.print("Enter something you want reversed: ");
		userInput = keyboard.nextLine();
		
		//Sends the user input string to the reversal method
		backwards.setUserInput(userInput);
				
		//Display a new section from entry prompt
		System.out.println("---------------------");
		//Show the original entry to the user
		System.out.print("You entered: ");
		//Print out the original string from the method
		System.out.print(backwards.getOriginalInput());
		//Extra line break
		System.out.println("");
		//Print out the reversed original string to the user
		System.out.print("And, the reversed entry is: ");
		//Print out the reversed string from the method
		System.out.print(backwards.getReversedInput());
		
		//Close the scanner to avoid memory issues.
		keyboard.close();

	}
	//End the main program
}



//Setup a new class for methods to be used within the program.
class Reversal
{	
	//Variable fields to hold accumulated characters.  Initially set empty.
	String originalInput = "";
	String reversedInput = "";
	
	//Method - A setter method that collects user data and reversed user data
	void setUserInput(String userEntry)
	{
	
	//Setup a character array to hold the user's string components
	char[] inputArray = userEntry.toCharArray();
	
	//Loop the first time to collect the user's original entry
	for (int counter = 0; counter < inputArray.length; counter++)
	{
		originalInput += (inputArray[counter]);
	}
	
	
    //Loop the second time to collect the reversed entry
	for (int counter = inputArray.length-1; counter >= 0; counter--)
    {
		reversedInput += (inputArray[counter]);
    }

	}

	//Method - A getter that returns the results of the original string
	String getOriginalInput()
	{
		return originalInput;
		
	}	

	//Method - A getter that returns the results of the original string reversed
	String getReversedInput()
	{
		return reversedInput;
		
	}	

//End the class
}

		
		
		
		

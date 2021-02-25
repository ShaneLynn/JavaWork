package chapter10;
/*Christopher S Lynn
 * Chapter 10
 * Programming Challenge 1, Test Scores Class (p. 741)
 * This class creates a constructor to accept array scores and averages them with exception handling.
 */

public class TestScores {
	
	//Setup the variables to store array data and the final output
	double[] rawScores; 
	double validAverage;
	
	//Setup a constructor that accepts an array, and also provides error handling.  This constructor directly calls the validation method.
	public TestScores(double[] vScores)	throws IllegalArgumentException
	{
		rawScores = vScores;
		validAverage = averageTest(vScores);
	}

	//This method validates scores using a loop, and it uses a check to identify if the score was entered in error
	private double averageTest(double[] rawScores)
	{
		///This is the accumulator to gather the score totals
		double gatherAverage = 0;
		
		//This variable stores the final average
		double average = 0;
		
		//Setting up a for loop to step through the array and get the totals
		for(int count = 0; count < rawScores.length; count++)
		{
			//This if check looks at each score in the array to see if it is valid
			if(rawScores[count] < 0 || rawScores[count] > 100)
			{
				throw new IllegalArgumentException
					("Element: " + (count) + ", Score: " + rawScores[count]
							+ "\nA score must be 0 or higher but not more than 100");
			}
			
			gatherAverage += rawScores[count];
		}
		
		//This calculation after the for loop takes the gathered average from the array and divides it by the total scores in the array
		//to get the average.
		average = (gatherAverage / rawScores.length);
		
		return (average);
	}
	
	//This method returns the calculated and validated average total
	public double getAverage()
	{
		return validAverage;
	}
}

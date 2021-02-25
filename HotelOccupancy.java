package chapter5;
/*Christopher S Lynn
 * Chapter 5
 * Programming Challenge 5 pg. 345
 * This program collects hotel floor and room counts to display occupancy metrics
 * 
 */

//This is needed for the Scanner inputs
import java.util.Scanner; 

//This is the main program class.
public class HotelOccupancy {
		
	//This is the main program method.	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hotelFloors;			//Placeholder for input of Hotel Floors
		int floorRooms;				//Accumulator for floor room entries
		int occupiedRooms;			//Accumulator for occupied room entries 
		int vacantRooms;			//Calculated field for the total vacant rooms.
		double occupancyRate; 		//Calculated field for the occupancy rate based on accumulator totals
				
		//Create the Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);

		//Set accumulators to 0 for question 2 and 3, and final calculations for ORate and VRooms
		floorRooms = 0;
		occupiedRooms = 0;
		occupancyRate = 0;
		vacantRooms = 0;
		
		
		//Asks the user the first question for overall hotel floors
		System.out.print("How many floors does the hotel have? ");
		hotelFloors = keyboard.nextInt();
		
		//Setup error checking for HotelFloors
		while (hotelFloors < 1) 
		{	
			System.out.print("Invalid Entry.  Enter 1 or more: ");	  
			hotelFloors = keyboard.nextInt();
		}
		

		//Main accumulator loop to collect and validate floor and occupied room entries from the user
		for (int fcount = 1, orcount = 1, frooms = 0, orooms = 0; fcount <= hotelFloors; fcount++, orcount++)
		{
			//Collect user input for total rooms per floor
			System.out.print("How many rooms does floor " + fcount + " have? ");
			frooms = keyboard.nextInt();
		
		   	//Error checking validation for rooms per floor
			while (frooms < 10) 
			{	
			System.out.print("Invalid Entry.  Enter 10 or more: ");	  
			frooms = keyboard.nextInt();
			}
			
			//Setup error checking validation for occupied rooms per floor
			System.out.print("How many occupied rooms does floor " + orcount + " have? ");
			orooms = keyboard.nextInt();
			
			//Error checking validation for occupied rooms per floor
			while (orooms > frooms) 
			{
			System.out.print("Invalid Entry.  Must be " + frooms + " or less.  Re-Enter: ");	  
			orooms = keyboard.nextInt();
			}
			  
			// Add current floor rooms and occupied rooms totals to accumulator fields.
		    floorRooms += frooms;  
		    occupiedRooms += orooms;  
				
		}	
			
		//Clear the keyboard newline buffer from data entry
		keyboard.nextLine();
		
		//Calculate the occupancy rate and vacant rooms from the accumulator data
		vacantRooms = (floorRooms - occupiedRooms);
		occupancyRate = ((double)occupiedRooms / floorRooms) * 100;
		
		//Print feedback to the user based on their entries and calculations
		/*System.out.println("Hotel Floors: " + hotelFloors); //Commenting out for assignment, used for verifying*/ 
		System.out.println("Number of Rooms: " + floorRooms);
		System.out.println("Occupied Rooms: " + occupiedRooms);
		System.out.println("Vacant Rooms: " + vacantRooms);
		System.out.println("Occupancy Rate: " + occupancyRate + "%");
		
		//Close out the keyboard input to avoid resource leaks
		keyboard.close();
	}

}

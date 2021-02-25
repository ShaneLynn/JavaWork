package chapter6;
/*Christopher S Lynn
 * Chapter 6
 * Programming Challenge 5 pg. 439-440
 * This class creates constructors and methods to display and compare month data.
 */

public class Month {
		
		//Setup the field to hold the variable for the class
		private int monthNumber;
	
		//Setup the default constructor that doesn't accept arguments
		public Month()
		{
			monthNumber = 1;
		}
	
		//Setup constructor 2 that accepts a number argument and validates it
		public Month(int m)
		{
			monthNumber = m;
			if(monthNumber < 1 || monthNumber > 12)
			{
				monthNumber = 1;
			}
		}
	
		//Setup constructor 3 that accepts a string argument for the month and transforms
		//the month name into the month number field.
		public Month(String m)
		{
			if(m.equalsIgnoreCase("january"))
			{
				monthNumber = 1;
			}
			else if(m.equalsIgnoreCase("february"))
			{
				monthNumber = 2;
			}
			else if(m.equalsIgnoreCase("march"))
			{
				monthNumber = 3;
			}
			else if(m.equalsIgnoreCase("april"))
			{
				monthNumber = 4;
			}
			else if(m.equalsIgnoreCase("may"))
			{
				monthNumber = 5;
			}
			else if(m.equalsIgnoreCase("june"))
			{
				monthNumber = 6;
			}
			else if(m.equalsIgnoreCase("july"))
			{
				monthNumber = 7;
			}
			else if(m.equalsIgnoreCase("august"))
			{
				monthNumber = 8;
			}
			else if(m.equalsIgnoreCase("september"))
			{
				monthNumber = 9;
			}
			else if(m.equalsIgnoreCase("october"))
			{
				monthNumber = 10;
			}
			else if(m.equalsIgnoreCase("november"))
			{
				monthNumber = 11;
			}
			else if(m.equalsIgnoreCase("december"))
			{
				monthNumber = 12;
			}
			else 
			{
				monthNumber = 1;
			}
		}
		
		//Setup the mutator that accepts month number input and validates the entry.  References
		//the prior constructor.
		public void setMonthNumber(int m)
			{
				this.monthNumber = m;
				if(monthNumber < 1 || monthNumber > 12)
				{
					this.monthNumber = 1;
				}
			}
		
		//Setup the accessor that gets the month number for the program
		public int getMonthNumber()
		{
			return monthNumber;
		}
		
		//Setup this accessor to get the month number and switch it for the month's name
		public String getMonthName()
		{
			String name = "";
			switch (monthNumber)
			{
			case 1:
				name = "January";
				break;
			case 2:
				name = "February";
				break;
			case 3:
				name = "March";
				break;
			case 4:
				name = "April";
				break;
			case 5:
				name = "May";
				break;
			case 6:
				name = "June";
				break;
			case 7:
				name = "July";
				break;
			case 8:
				name = "August";
				break;
			case 9:
				name = "September";
				break;
			case 10:
				name = "October";
				break;
			case 11:
				name = "November";
				break;
			case 12:
				name = "December";
				break;
			}
			return name;
		}
		
		//Sets up the toString method to report on the state of the object
		public String toString()
		{
			return getMonthName();
		}
		
		//Setup validation for 3 object comparisons: equal, greater and less than
		public boolean equals(Month month2)
		{
			boolean status;
			
			if (month2.getMonthNumber() == monthNumber)
				status = true;
			else
				status = false;
			
			return status;
		}
		
		public boolean greaterThan(Month month2)
		{
			boolean status;
			
			if (monthNumber > month2.getMonthNumber())
				status = true;
			else
				status = false;
			
			return status;
		}
		
		public boolean lessThan(Month month2)
		{
			boolean status;
			
			if (monthNumber < month2.getMonthNumber())
				status = true;
			else
				status = false;
			
			return status;
		}
}


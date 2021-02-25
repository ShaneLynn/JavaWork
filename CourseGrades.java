package chapter9;
/*Christopher S Lynn
 * Chapter 9
 * Programming Challenge 5, Course Grades (p. 683)
 * This class collects scores from other classes and sets up a string to format and display them.
 */

//This class inherits from the superclass
public class CourseGrades extends GradedActivity
{
	
	//Initialize a default constructor
	public CourseGrades()
	{	}

	//Setup the array to store the entries from each class file, make it private to avoid manipulation
	private GradedActivity[] FinalGrades = new GradedActivity[4];
	
	
	//Method to store GradedActivity scores in the array 
	public void setLab(GradedActivity vGradedActivityScores)
	{
		FinalGrades[0] = vGradedActivityScores;
	}

	//Method to store the PassFail scores in the array 
	public void setPassFailExam(PassFailExam vPassFailGrades)
	{
		FinalGrades[1] = vPassFailGrades;
	}
	
	//Method to store the Essay scores in the array 
	public void setEssay(Essay vEssay)
	{
		FinalGrades[2] = vEssay;
	}
	
	//Method to store the Final Exam scores in the array 
	public void setFinalExam(FinalExam vFinalExam)
	{
		FinalGrades[3] = vFinalExam;
	}

	
	//Setup the toString method to send the final grades format and scores to CourseGradesDemo
	
	 public String toString()
	 {
	         //Create the display format for the user and include the results from each grade area.
	         String finalScores = 	"Lab Score:            "	+  	FinalGrades[0].getScore() + "     |     " + "Grade: " + FinalGrades[0].getGrade() + 
	                      			"\nPass/Fail Exam Score: "	+	FinalGrades[1].getScore() + "     |     " + "Grade: " + FinalGrades[1].getGrade() +
	                      			"\nEssay Score:          "	+	FinalGrades[2].getScore() + "     |     " + "Grade: " + FinalGrades[2].getGrade() +
	                      			"\nFinal Exam Score:     "	+	FinalGrades[3].getScore() + "     |     " + "Grade: " + FinalGrades[3].getGrade()
	                      			;
	 
	         //Return the formatted display string.
	         return finalScores;
	 }	
	
	
	//End the class
}

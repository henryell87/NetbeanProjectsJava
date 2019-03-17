/*
 * Copyright 2016 henryellbytes
 */

package gradebook;

/**
 * @author HENRYELL
 */
import java.util.Scanner;


public class GradeBookTest
{
      
  public static void main(String args[]) 
  {
      // Scanner input = new Scanner( System.in );
      
      GradeBook myGradeBook = new GradeBook(
      "CS101 Introduction to Java Programming" );
      
      //System.out.printf( "Initial course name is is: %s\n\n",
     // myGradeBook.getCourseName() );
      
     // System.out.println( "Please enter the course name:");
     // String theName = input.nextLine();
     // myGradeBook.setCourseName(theName);
     // System.out.println();
    
    
      myGradeBook.displayMessage();
      myGradeBook.determineClassAverage();
        // TODO code application logic here
  }
}

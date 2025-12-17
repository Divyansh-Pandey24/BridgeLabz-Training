// Writing a code to find how many pens each student will get

// Create penDistribution class to find how many pens each student will get
public class PenDistribution
{
  public static void main(String []args)
  {
    // Create a variable to indicate number of pens
     int noOfPens=14;
     
    // Create a variable to indicate number of students
     int noOfStu=3;
     
    // Create a variable to indicate pens per students
     int penPerStu=noOfPens/noOfStu;
    
    // Create a variable to indicate non distributed pens
     int nonDistriPens=noOfPens%noOfStu;

   // Print pen per student and remaining pen not distributed
     System.out.println("The Pen Per Student is "+penPerStu+" and the remaining pen not distributed is "+nonDistriPens);
    
    }

}
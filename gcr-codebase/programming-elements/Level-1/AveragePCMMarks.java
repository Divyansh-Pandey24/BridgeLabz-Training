// Writing a code to calculate the average percentage marks in PCM
// Create AveragePCMMarks class to calculate average marks

public class AveragePCMMarks{

    public static void main(String[]args){
        
        //Variables to hold Scorable marks, maths marks, physics marks, chemistry marks
        int scorableMarks = 100, maths = 94, physics = 95, chemistry = 96;

        //calculating average percent marks
        double avgPercentMark = ( (maths + physics + chemistry) / 300.0 ) * 100;
        
        //Print the average percent mark of sam
        System.out.println("Sam's average mark in PCM is " + avgPercentMark);
    }
}
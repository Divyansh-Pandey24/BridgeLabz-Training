import java.util.Scanner;

public class StudentGrade {

    // Method to generate random 2-digit PCM marks
    public static int[][] generatePCMMarks(int students) {
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = (int)(Math.random() * 90) + 10; // Physics
            marks[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
            marks[i][2] = (int)(Math.random() * 90) + 10; // Maths
        }
        return marks;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][3]; // total, avg, %

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Method to calculate grade
    public static String[] calculateGrades(double[][] result) {
        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double percentage = result[i][2];

            if (percentage >= 80)
                grades[i] = "A";
            else if (percentage >= 70)
                grades[i] = "B";
            else if (percentage >= 60)
                grades[i] = "C";
            else if (percentage >= 50)
                grades[i] = "D";
            else if (percentage >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }
        return grades;
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] marks, double[][] result, String[] grades) {

        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grades[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = generatePCMMarks(students);
        double[][] result = calculateResults(marks);
        String[] grades = calculateGrades(result);

        displayScorecard(marks, result, grades);

        sc.close();
    }
}

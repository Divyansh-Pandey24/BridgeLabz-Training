import java.util.*;

public class RajResultGenerator {

    // Method to give grades based on marks
    public static void generateResult() {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total += sc.nextInt();
        }

        double avg = total / 5.0;

        char grade;
        switch ((int) avg / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        generateResult();
    }
}

import java.util.*;

public class ElectionBoothManager {

    // Method to check whether the person is eligible to vote or not
    public static void startElection() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int age = sc.nextInt();

            if (age == -1) break;

            if (age >= 18) {
                int vote = sc.nextInt();
                System.out.println("Vote has been given for candidate " + vote);
            } else {
                System.out.println("Not eligible to vote");
            }
        }
    }

    public static void main(String[] args) {
        startElection();
    }
}

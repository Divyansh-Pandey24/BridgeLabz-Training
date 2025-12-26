import java.util.*;

public class MetroSmartCard {

    // Method to detect the balance 
    public static void metroSystem() {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();

        while (balance > 0) {
            double distance = sc.nextDouble();

            if (distance == -1) break;

            double fare = (distance <= 10) ? 20 : 40;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted. Balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
                break;
            }
        }
    }

    public static void main(String[] args) {
        metroSystem();
    }
}

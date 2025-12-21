public class SpringSeason {

    // Method to check Spring Season
    public static boolean isSpringSeason(int month, int day) {

        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Take input from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Calling the method
        boolean result = isSpringSeason(month, day);

        // Displaying the result
        if (result) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}

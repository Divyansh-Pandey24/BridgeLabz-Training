import java.util.Arrays;

class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Generates numbers from 100000 to 999999
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check whether all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class OTPGeneratorMain {
    public static void main(String[] args) {

        int[] otps = new int[10];

        // Generate OTPs 10 times
        for (int i = 0; i < otps.length; i++) {
            otps[i] = OTPGenerator.generateOTP();
        }

        // Displaying OTPs
        System.out.println("Generated OTPs:");
        System.out.println(Arrays.toString(otps));

        // Displaying the results
        if (OTPGenerator.areOTPsUnique(otps)) {
            System.out.println("All OTPs are UNIQUE");
        } else {
            System.out.println("Duplicate OTPs found");
        }
    }
}

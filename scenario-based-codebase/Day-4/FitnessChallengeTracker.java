/* Sandeep’s Fitness Challenge Tracker 
--Each day Sandeep completes a number of push-ups.
1. Store counts for a week.
2. Use for-each to calculate total and average.
3. Use continue to skip rest days */

import java.util.Scanner;

public class FitnessChallengeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Arrays to store push ups for a week
        int []daysPushUps = new int[7];
        int totalPushUps = 0, average = 0, restDays = 0;
 
        //taking user input 
        System.out.println("\n=========WELCOME FITNESS TRACKER===========");
        for (int i = 0; i < daysPushUps.length; i++) {
            System.out.println("Sandeep please enter you push-up count for day " + (i + 1));
            daysPushUps[i] = sc.nextInt();
        }

        //
        for (int pushUps : daysPushUps) {
            if (pushUps == 0) {
                restDays++;
                continue;
            }

            totalPushUps += pushUps;
        }

        //Finding the average push ups
        average = totalPushUps / (7 - restDays);

        //Printing the final results
        System.out.println("\n-----------------Status--------------");
        System.out.println("\n Total Push ups is : " + totalPushUps +
                           "\n Average Push ups is : " + average );
        System.out.println("\n--------------------------------------");

        sc.close();
        
    }
}
/*
9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.Scanner;

public class SchoolBusAttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // List of 10 students
        String[] students = {
            "Rahul", "Amit", "Neha", "Riya", "Arjun",
            "Priya", "Karan", "Sneha", "Varun", "Ananya"
        };

        int presentCount = 0;
        int absentCount = 0;

        System.out.println("===== School Bus Attendance System =====\n");

        for (String student : students) {

            System.out.printf("%s - Present or Absent? : ", student);
            String status = sc.next();

            if (status.equalsIgnoreCase("Present")) {
                presentCount++;
            } else {
                absentCount++;
            }
        }

        System.out.println("\n========= Attendance Summary =========");
        System.out.printf("Total Students : %d\n", students.length);
        System.out.printf("Present        : %d\n", presentCount);
        System.out.printf("Absent         : %d\n", absentCount);
        System.out.println("======================================");

        sc.close();
    }
}

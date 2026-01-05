package com.day03.campusconnect;
import java.util.*;

public class CampusConnectApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Faculty Name:");
        String fname = sc.nextLine();

        System.out.println("Enter Faculty Email:");
        String femail = sc.nextLine();

        System.out.println("Enter Faculty ID:");
        String fid = sc.nextLine();

        Faculty faculty = new Faculty(fname, femail, fid);

        System.out.println("Enter Course Name:");
        String cname = sc.nextLine();

        Course course = new Course(cname, faculty);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++) {

            System.out.println("\nEnter Student " + i + " Name:");
            String sname = sc.nextLine();

            System.out.println("Enter Email:");
            String semail = sc.nextLine();

            System.out.println("Enter ID:");
            String sid = sc.nextLine();

            Student s = new Student(sname, semail, sid);

            s.enrollCourse(course);

            System.out.println("Enter number of grades:");
            int g = sc.nextInt();

            for(int j = 1; j <= g; j++) {
                System.out.println("Enter grade " + j + ":");
                double gr = sc.nextDouble();
                s.addGrade(gr);
            }
            sc.nextLine();
        }

        course.printCourseDetails();

        sc.close();
    }
}

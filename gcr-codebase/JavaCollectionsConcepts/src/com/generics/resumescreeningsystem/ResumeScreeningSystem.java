package com.generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Rajesh", 3, 80, new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Aman", 1, 78, new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Neha", 2, 60, new ProductManager());

        ResumeScreeningUtil.screenResume(r1);
        ResumeScreeningUtil.screenResume(r2);
        ResumeScreeningUtil.screenResume(r3);

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        System.out.println("\n---- Screening Pipeline ----");
        ScreeningPipeline.processResumes(roles);
    }
}

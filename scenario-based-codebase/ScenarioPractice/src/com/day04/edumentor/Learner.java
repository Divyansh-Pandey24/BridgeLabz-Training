package com.day04.edumentor;
public class Learner extends User implements ICertifiable {

    private boolean isFullTime;

    public Learner(String name, String email, String userId, boolean isFullTime) {
        super(name, email, userId);
        this.isFullTime = isFullTime;
    }

    @Override
    public String generateCertificate() {
        if (isFullTime) {
            return "Full-Time Course Certificate awarded to " + name;
        } else {
            return "Short Course Certificate awarded to " + name;
        }
    }
}

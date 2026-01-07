package com.day05.loanbuddy;
abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int termMonths;
    protected double interestRate;

    private boolean approved = false;   // restricted access

    public LoanApplication(Applicant applicant, int termMonths, double interestRate) {
        this.applicant = applicant;
        this.termMonths = termMonths;
        this.interestRate = interestRate;
    }

    // Only internal methods can change approval status
    protected void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isApproved() {
        return approved;
    }
 
    protected double emiFormula(double principal, double monthlyRate, int n) {
        double x = Math.pow(1 + monthlyRate, n);
        return principal * monthlyRate * x / (x - 1);
    }
}

package com.day05.loanbuddy;
class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int termMonths) {
        super(applicant, termMonths, 7.5); // 7.5% interest
    }

    @Override
    public boolean approveLoan() {

        boolean status = applicant.getCreditScore() >= 700 &&
                         applicant.getIncome() >= 30000 &&
                         applicant.getLoanAmount() <= applicant.getIncome() * 50;

        setApproved(status);
        return status;
    }

    @Override
    public double calculateEMI() {
        double r = interestRate / 12 / 100;
        return emiFormula(applicant.getLoanAmount(), r, termMonths);
    }
}

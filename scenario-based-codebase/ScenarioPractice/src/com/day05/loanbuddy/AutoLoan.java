package com.day05.loanbuddy;
class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int termMonths) {
        super(applicant, termMonths, 9.0);
    }

    @Override
    public boolean approveLoan() {

        boolean status = applicant.getCreditScore() >= 650 &&
                         applicant.getLoanAmount() <= applicant.getIncome() * 20;

        setApproved(status);
        return status;
    }

    @Override
    public double calculateEMI() {
        double r = interestRate / 12 / 100;
        return emiFormula(applicant.getLoanAmount(), r, termMonths);
    }
}

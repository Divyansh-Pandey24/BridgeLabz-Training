package com.day05.loanbuddy;
class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int termMonths) {
        super(applicant, termMonths, 12.5);
    }

    @Override
    public boolean approveLoan() {

        boolean status = applicant.getCreditScore() >= 600 &&
                         applicant.getIncome() >= 15000 &&
                         applicant.getLoanAmount() <= applicant.getIncome() * 10;

        setApproved(status);
        return status;
    }

    @Override
    public double calculateEMI() {
        double r = interestRate / 12 / 100;
        return emiFormula(applicant.getLoanAmount(), r, termMonths);
    }
}

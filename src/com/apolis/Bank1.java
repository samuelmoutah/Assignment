package com.apolis;

public class Bank1 extends Mortgage {
    public Bank1(int m, int t, double r) {
        this.months = m;
        this.loanAmount = t;
        this.rate = r;
    }
    @Override
    public double calculate() {
        double totalInterest = loanAmount * rate;
        double totalLoanAmount = loanAmount + totalInterest;
        double monthlyPayment = totalLoanAmount / months;
        return monthlyPayment;
    }
}

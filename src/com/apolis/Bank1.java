package com.apolis;

public class Bank1 extends Mortgage {
    public Bank1(int m, int t, double r) {
        this.months = m;
        this.principleAmount = t;
        this.rate = r / 12 / 100;
    }

    @Override
    public double calculate() {
        double numerator = principleAmount * rate * Math.pow((1+rate), months);
        double denominator = Math.pow((1+rate), months) - 1;
        double monthlyPayment = numerator / denominator;
        return monthlyPayment;
    }


}

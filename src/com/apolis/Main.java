package com.apolis;

public class Main {

    public static void main(String[] args) {
        Bank1 b1 = new Bank1(360, 100000, 3.92);

        double payment = b1.calculate();

        System.out.println("Monthly Payment: " + (String.format("%.2f", payment)));


    }
}


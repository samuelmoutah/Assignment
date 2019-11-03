package com.apolis;

public class Main {

    public static void main(String[] args) {
        Bank1 b1 = new Bank1(360, 300000, 3.5);

        double payment = b1.calculate();

        System.out.println("Monthly Payment: " + payment);


    }
}


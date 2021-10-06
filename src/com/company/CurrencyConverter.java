package com.company;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        int rate=23000;
        System.out.println("Input amount of USD: ");
        Scanner scanner=new Scanner(System.in);
        double usd=scanner.nextDouble();
        double vnd=usd*rate;
        System.out.println(usd+" USD= "+vnd+ " VND");
    }
}

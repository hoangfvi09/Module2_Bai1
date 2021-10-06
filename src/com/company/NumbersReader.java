package com.company;

import java.util.Scanner;



public class NumbersReader {
    public static String numbersReader(int number){
        String[] zeroToNineteenReader={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tensReader={"zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        int ones=number%10;
        int tens=(number%100-ones)/10;
        int hundred= number/100;
        String reader="";
        if ((number < 0) || (number > 999)) {
            System.out.println("Out of ability.");
        }
        else {

            if(hundred>0) {
                reader+= zeroToNineteenReader[hundred] + " hundred";
            }
            if ((number % 100) >0){
                reader+= " and ";
                if ((number % 100) < 20) {
                    reader+=" "+zeroToNineteenReader[number % 100];
                } else {
                    reader+=" "+tensReader[tens];
                    if (ones>0) {
                        reader+=" "+zeroToNineteenReader[ones];
                    }
                }
            }
        }
        return reader;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number that is less than 1000: ");
        int number = scanner.nextInt();
        System.out.println(numbersReader(number));



        }




    }


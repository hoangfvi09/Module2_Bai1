package com.company;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a month: ");
        int month=scanner.nextInt();
        if((month>=1)&&(month<=12)){
            switch(month){
                case 2:
                    System.out.println("This month has 28 or 29 days.");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("This month has 30 days.");
                    break;
                default:
                    System.out.println("This month has 31 days.");

            }
        }else{
            System.out.println("This is not a month in a year.");
        }


    }
}

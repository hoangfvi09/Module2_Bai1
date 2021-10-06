package com.company;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your height (m): ");
        double height = scanner.nextDouble();
        System.out.println("Enter your weight (kg): ");
        double weight = scanner.nextDouble();
        double bmi=weight/Math.pow(height,2);
        if(bmi<18.5)
            System.out.println("BMI "+bmi+": Underweight");
        else if(bmi<25)
            System.out.println("BMI "+bmi+": Normal");
        else if(bmi<30)
            System.out.println("BMI "+bmi+": Overweight ");
        else
            System.out.println("BMI "+bmi+": Obese");
        }
    }





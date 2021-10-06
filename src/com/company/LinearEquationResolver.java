package com.company;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Given ax+b=0, solve for x.");
        System.out.println("Enter a:");
        float a= scanner.nextFloat();
        System.out.println("Enter b:");
        float b= scanner.nextFloat();
        if(a==0){
            if (b==0){
                System.out.println("The equation has infinite solutions.");
            }else{
                System.out.println("The equation has no solutions.");
            }
        }else{
            System.out.println("The equation has a solution: x= "+-b/a);
        }
    }
}

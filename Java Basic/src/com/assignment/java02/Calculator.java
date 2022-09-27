package com.assignment.java02;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculator . Enter 2 nos:");

        Scanner in1 = new Scanner(System.in);
        float var1 = in1.nextFloat();
        float var2 = in1.nextFloat();
        System.out.println("Enter a operator , + , - , * ,/:");
        String op = in1.next();

        if(op.equals("+")){
            System.out.println("calculation of nos : " + (var1 + var2));
        }
        else if(op.equals("-")){
            System.out.println("calculation of nos : " + (var1 - var2));
        }
        else if(op.equals("*")){
            System.out.println("calculation of nos : " + (var1 * var2));
        }
        else if(op.equals("/") && var2 !=0 ){
            System.out.println("calculation of nos : " + (var1 / var2));
        }
        else{
            System.out.println("Input error");
        }

    }
}

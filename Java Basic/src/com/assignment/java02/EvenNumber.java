//1. Write a program to print whether a number is even or odd, also take
//input from the user.

package com.assignment.java02;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Enter the no.: ");

        Scanner in1 = new Scanner(System.in);
        int var = in1.nextInt();

        if(var % 2 ==0){
            System.out.println(var + " is Even");
        }
        else{
            System.out.println(var +" is  odd");
        }
    }
}

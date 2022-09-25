package com.abhay;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter the two nos.:");
        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextInt();
        int num2 = input1.nextInt();

        int sum = num1+ num2;
        System.out.println("sum =" +sum);
    }
}

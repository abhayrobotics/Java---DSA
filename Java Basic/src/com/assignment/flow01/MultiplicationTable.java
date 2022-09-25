//Multiplication Table

package com.assignment.flow01;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.print("Enter the no.:");
        Scanner in1 = new Scanner(System.in);
        int num = in1.nextInt();

        for(int count =1; count<11; count++){
            System.out.println(num +" x "+ count +" = "+(num*count));
        }
    }
}

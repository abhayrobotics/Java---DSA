package com.abhay;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        System.out.println("Enter you rno: ");
        //    will take input
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
//        String name = input.next();
        System.out.println("Your Roll no. is : "+ rollno);

//        rather than , use _ for getting the value of 1 crore , _ gets ignored
        int a = 1_00_00_000;
        System.out.println(a);
    }
}

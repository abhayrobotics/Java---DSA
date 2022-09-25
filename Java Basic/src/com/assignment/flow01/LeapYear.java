// checking Leap Year
package com.assignment.flow01;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("input a year:");

        Scanner input1 = new Scanner(System.in);
        int yr = input1.nextInt();

        if( (yr %4 == 0) && (yr %100 !=0)){
            System.out.println(yr + " is a leap Year");
        }
        else if (yr %400 ==0) {
            System.out.println(yr + " is a leap Year");
        }
        else {
            System.out.println("not a leap Year");
        }
    }
}

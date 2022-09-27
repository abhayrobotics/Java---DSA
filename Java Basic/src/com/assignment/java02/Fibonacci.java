//7. To calculate Fibonacci Series up to n numbers.
package com.assignment.java02;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter a no for fibonacci series: ");

        Scanner in1 = new Scanner(System.in);
        int count = in1.nextInt();

        if(count ==1){
            System.out.println("0 ");
        } else if (count ==2) {
            System.out.println("0 1 ");
        }
        else {
            System.out.print("0 1 ");
            int i = 2;
            int var = 0;
            int  result=1;
            while ( i< count) {

//                old no. preserve
                int temp = result;
//                new number updated
                result = result + var;

                System.out.print(result+" ");

//                old no. updated
                var = temp;
                i++;

            }
        }
    }
}

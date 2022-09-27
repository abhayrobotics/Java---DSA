//8. To find out whether the given String is Palindrome or not.

package com.assignment.java02;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Palindrome {
    public static void main(String[] args) {


        System.out.println("Enter a no to check Palindrome: ");

        Scanner in1 = new Scanner(System.in);
        int var = in1.nextInt();
        int original= var;

    //    reverse a no.
        int result =0;
        int remainder =0;
        while(var > 0){
            remainder = var % 10 ;
            if(var>10) {
                result = result * 10 + remainder;
            }
            else{
                result = result * 10 + var;
            }
            var = (var/10);

        }

//        System.out.println(result);
        if (original ==result){
            System.out.println(original + " is a Palindrome");
        }
        else{
            System.out.println(original + " is  not a Palindrome");
        }
    }
}

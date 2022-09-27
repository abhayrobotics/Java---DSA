//9. To find Armstrong Number between two given number.
// 9474 = 9^4 +4^4 +7^4 +4^4

package com.assignment.java02;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println("Enter a no to check Armstrong no.: ");

        Scanner in1 = new Scanner(System.in);
        int var = in1.nextInt();
        int count=0;
        int original = var;

//        calculating no. of digits
        while (var>0){
            var= var/10;
            count++;
        }
        System.out.println("Count: " +count);

//        calculation
        int finalNo  =0;
        int result;
        int i= 0;
        var= original;

        while (i<count){
            result = var%10;
            var= var/10;
            finalNo = (int) (Math.pow(result,count)) + finalNo;
            i++;
        }
        if( finalNo== original){
            System.out.println(original+ " is a Armstrong no.");
        }
        else {
            System.out.println(original+ " is not a Armstrong no.");
        }
    }
}

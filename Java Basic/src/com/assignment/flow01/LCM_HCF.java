//LCM and HCF

package com.assignment.flow01;

import java.util.Scanner;

public class LCM_HCF {

    public static void main(String[] args) {

        System.out.println("Enter two nos: ");

        Scanner in1 = new Scanner(System.in);
        int num1 = in1.nextInt();
        int num2 = in1.nextInt();

        if (num1 == num2) {
            System.out.println("LCM and HCF are both Same" + num1);
        }
        else {
            if (num1 < num2)
            {
                int small = num1;
                int big = num2;
            }
            else
            {
                int small = num2;
                int big = num1;
            }
            //  HCF


        }
    }
}

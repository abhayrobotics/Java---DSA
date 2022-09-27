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
            System.out.println("LCM and HCF are both Same : " + num1);
        }
        else {

            int small;
            int big;
            if (num1 < num2)
            {
                small = num1;
                big= num2;
            }
            else
            {
                small = num2;
                big = num1;
            }
//            HCF
            while((num2% small != 0 ) ||  (num1 % small != 0 ) ){
                small--;
            }
            System.out.println("HCF is "+small);

//            LCM
            while((big % num1 !=0 ) ||  (big % num2 !=0 ) ){
                big++;
            }
            System.out.println("LCM is "+ big);

        }
    }
}

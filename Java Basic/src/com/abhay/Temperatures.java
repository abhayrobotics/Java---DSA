package com.abhay;

import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {

        System.out.println("Enter the temp in Celcius: ");
        Scanner input1 = new Scanner(System.in);
        float t_C = input1.nextFloat();

        float t_F = (t_C * 9 /5) +32;

        System.out.println("temperature in farenheit is " + t_F);

    }
}

//  taking input as integer or x
package com.assignment.flow01;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class InfiniteLoop {
    public static <string> void main(String[] args) {
        int result =0;

        String input ="";
        int user = 0;

//       while( input != "x" )
       while( !input.equals("x") )
       {
           System.out.print("Enter the no. or 'x' to end the program : ");
            Scanner in1 = new Scanner(System.in);
            input = in1.next();

            if(!input.equals("x")) {
                user = parseInt(input);
                result = result + user;
            }
        }
        System.out.println("Result: "+ result);
    }
}

package com.abhay;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

//!      # Example 1
//        Scanner input1 = new Scanner(System.in);
//        int num = input1.nextInt();
//            float num = input1.nextFloat();
//            Evem if you enter a integer , it will be automatically converted into float as compatible ,
//            not the other way arounf
//        System.out.println(num);

//        # Example 2
//      convert into different data type , TYpe casting
//        int num2 = (int)(56.83f);

//        System.out.println(num2);
//      one thing to note its not rounding UP, its negleting the decimal parts.


//        Automatic type promotions in expressions

//        # Example 3
//        int  a = 130;
//        byte b = (byte)(a*2);
//        System.out.println(a);
//        System.out.println(b);
//        a byte maximum storage space is 256 , if doing expression , 260 came it is converted to integer ,
//        and return as byte of 4(260-256)

//           # Example 4
//        byte a= 40;
//        byte b= 50;
//        byte c= 100;
//        int d = a * b /c;
//        System.out.println(d);
//        here no error as in expression , the byte are promoted to integer , but in below expamle 5.

//          # Example 5
//            byte a =20;
//            a= a+2;
//            error , although the byte a has the capacity to store the value  of 20+2 ,
//            bt since it is converted to integer in can not be stored in a (byte data type).

//             # Example 6 : auto matic type convertion into ASCII
//        int num = 'A';
//        System.out.println(num);

//        also print hindi , chinese etc all alanguages, JAVA follows UNIcode
//        System.out.println("");



//         # Example 7  : auto matic promotions in expression
            byte b = 42;
            char c = 'B';
            short s = 1234;
            int i = 250;
            float f = 2.35f;
            double d= 13153.5644;
            double result = (f+b) + (i/c) - (d*s);
//                float + byte = float
//                  int / char = int
//                  double * short = double
//        result = double( max compatible
        System.out.println((f+b)+" "+ (i/c) +" "+ (d*s));

        System.out.println(result);




   }

}

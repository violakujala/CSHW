package com.company;

public class Main {

    public static void main(String[] args) {


        // HOMEWORK 1.2

       /* int w = 1;
        if (w <= 2)
            System.out.println("the price is " + (3));

        else if (w <= 5)
            System.out.println("the price is " + (2 * w - 1));

        else if (w > 5)
            System.out.println("the price is " + (3 * w - 6)); */


        // HOMEWORK 1.3

        // 1


         /*int a = 0;
        int result = 1;

        for(int i = 0; i < a; i++) {
            result *= 3;
        }

        System.out.println(result); */

        // 2
        /* int a = 3;
        int b = -3;
        int result = 1;

        for(int i = 0; i < a; i++) {
            result *= b;
        }

            System.out.println(result);*/


        // HOMEWORK 1.4

        /* int n = 1;
        boolean found = false;

        while (!found) {
            if( (n*n*n + 91) % 47 == 0) {
                found = true;
                System.out.println(n);
            }
            else n = n + 1;
        } */


        // HOMEWORK 1.5


        // HOMEWORK 2.1

        /*
        int A = 3, B = 4, C = 5;
        int result = A;

                if (B > result)
                    result = B;
                if (C > result)
                    result = C;
                System.out.println(result); */


        // HOMEWORK 2.2

       /* int X = 5;
        int Y = -7;
        int result = 0;
        int M = 0;

        if (Y < 0) {
            Y = -Y;
            M = -1; }
        else
            M = 1;

        while(Y > 0)
        {
            if ( Y % 2 == 0)
            {
                X = X + X;
                Y = Y / 2;
            }
            else
            {
                result = result + X;
                Y = Y - 1;
            }
        }
        if (M  < 0)
            result = - result;

        System.out.println(result); */


        // HOMEWORK 3.3


        /* boolean found = false;

        for( int a = 1; !found; a++)
        {
            int integer = a;
            if (integer % 387 == 0 && integer % 6381 == 0)
            {
                found = true;
                System.out.println(" the smallest integer divisible by 387 and 6381 is " + integer);
            }
        } */


        // HOMEWORK 3.4


    }
}
package com.udemy.mycode;
import java.util.Scanner;

/* 
* This program is for finding the roots of a quadratic equation
*/

public class QuadraticRootsExample {
    /* We should use these vars:
    - int a, b, c
    - double r1, r2
    */

    public static void FindRoots() {
        int a, b, c;
        double r1, r2;
        Scanner sc = new Scanner(System.in);

        System.out.println("To find the roots of a given quad formula, let's start with the variables of your quad formula! ");
        System.out.println("What is the value of A in the quad formula?");
        a = sc.nextInt();

        System.out.println("What is the value of B in the quad formula?");
        b = sc.nextInt();

        System.out.println("What is the value of C in the quad formula?");
        c = sc.nextInt();

        r1 = ((-b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a));
        r2 = ((-b - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a));

        System.out.println(" ");
        System.out.println("##########################################################");
        System.out.println("##########################################################");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Root 1 equals: -> -> " + r1);
        System.out.println("Root 2 equals: -> -> " + r2);
    }


    public static void main (String[] args)
    {
        FindRoots();
    }
}

package main.java.com.udemy.myCode;

import java.util.Scanner;

/* 
* This program is for finding the roots of a quadratic equation
*/

public class QuadraticRootsExample {
    /* We should use these vars:
    - int a, b, c
    - double r1, r2
    */

    public static int[] FormulaValues() {
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

        return new int[] {a, b, c};
    }

    public static void Roots() {
        
    }
}

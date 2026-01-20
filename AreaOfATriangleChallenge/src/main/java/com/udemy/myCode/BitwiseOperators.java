package com.udemy.mycode;

public class BitwiseOperators {
    /* 
    - Bitwise operators: Bitwise operators work on the individual bits (binary representation) of integer values.
    - The AND operation compares each bit position. Only when both bits are 1 does the result have a 1 in that position. 
    */

    public static void main(String[] args) {
        int x = 10, y = 6, z;
        z = x & y;
        System.out.println(z); // 0010 (bitwise) AND 2 (decimal).
    }
}
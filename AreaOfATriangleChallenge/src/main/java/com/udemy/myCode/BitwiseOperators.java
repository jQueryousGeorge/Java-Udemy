package com.udemy.mycode;

public class BitwiseOperators {
    /* 
    - Bitwise operators: Bitwise operators work on the individual bits (binary representation) of integer values.
    - The AND operation compares each bit position. Only when both bits are 1 does the result have a 1 in that position. 
    */

    public static void BitwiseExample1() {
        int x = 10, y = 6, z;
        z = x & y;
        System.out.println(z); // 0010 (bitwise) AND 2 (decimal).
    }
    
    public static void BitwiseExample2() {
        /* 
        # Prompt: 

        - "Using bitwise operators, pack the two values 9 and 12 into a single byte variable, then extract and print the first value."
        - Or more specifically:
        - "Write Java code that stores two 4-bit numbers (9 and 12) in a single byte using bit shifting and bitwise OR, then uses masking and shifting to retrieve the value stored in the upper 4 bits."
        */
        byte a = 9, b = 12;
        byte c;

        c = (byte) (a << 4); // Left shift a by 4 bits (moves it to the upper half of the byte)
        c = (byte) (c | b); // OR operation combines c (upper 4 bits) with b (lower 4 bits)

        System.out.println((c&0b11110000) >> 4);
        // c & 0b11110000 masks out the lower 4 bits, keeping only upper 4 bits
        // >> 4 shifts right by 4 to get the original value back

        /* 
        # This is a bit-packing technique - storing two 4-bit values in a single 8-bit byte to save memory.
        */
    }

    public static void main(String[] args) {
        BitwiseExample2();
    }
}
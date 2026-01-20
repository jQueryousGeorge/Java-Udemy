package com.udemy.mycode;

public class IncAndDecrementOperators {
    public static void main(String[] args) {
        // POST- AND PRE-INCREMENT CONCEPT :
        int x = 5, y;
        y = x++;

        System.out.println(x); // 6
        System.out.println(y); // 5 
        /* 
            Honestly, a bit confused why 'y' remains as '5' here. Lol. 
        */

        /* Explanation:

            - In the statement y = x++;, the ++ operator is used in its "post-increment" form. 
            - This means:
                - The current value of x (which is 5) is assigned to y.
            - After the assignment, x is incremented by 1 (so x becomes 6).
            - So, y gets the value before x is incremented, which is 5. If you had used y = ++x;, then x would be incremented first (to 6), and y would also be 6.
        */

            int a = 2, aa = 2, bb= 5, b = 5, c, cc, m = 4, mm = 4;
            c = a * ++m + b;
            System.out.println(c);

            cc = aa * mm++ + bb; // 15
            System.out.println(cc); // 13

            // ###################################

            float f = 5 * 3;
            f++;
            System.out.println(f); // 16.0
            /* 
            ********* Explanation:
            - The ++ operator doesn't go back and change the 5 to 6 in the original multiplication. Once 5 * 3 is evaluated and assigned to f, that expression is done. The increment only affects the variable f itself, adding 1 to whatever value it currently holds.
            */


            // ###################################

            char rt = 'A';
            rt++;
            System.out.println(rt); // 'B'
            /* 
            ********* Explanation:
            - 'A' = 65 in Unicode. When we increment, it become 66, which is a 'B', not an 'A'.
            */



            // ###################################

            byte bbb = 5;
		
            // bbb = bbb + 1; // Error!!
            
            System.out.println(b);
            /* 
            ** Explanation:
            - Contact.java:5: error: incompatible types: possible lossy conversion from int to byte
		    - - bbb = bbb + 1;

            - Basically, the '1' is an Integer, and conflicts with the byte bbb.
            - 'bbb++'' in place of 'b = b + 1' increment operator will work, though.
            */
            
    }
}
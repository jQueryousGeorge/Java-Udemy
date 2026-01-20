package com.udemy.mycode;

public class IncAndDecrementOperators {
    public static void main(String[] args) {
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
    }
}

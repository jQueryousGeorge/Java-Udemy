package com.udemy.mycode;

public class WideningAndNarrowing {

    public static void WideAndNarrowExample1() {
        int i = 10;
        float f = 10.5f;

        i = (int) f;
        System.out.println(i); // 10 -- so, as you can see, we lost data: the 0.5 from the float.
    }

    public static void main(String[] args) {
        WideAndNarrowExample1();
    }
}

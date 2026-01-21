package com.udemy.myCode;

class typeTester {
    void printType(byte x) {
        System.out.println(x + " is a byte");
    }

    void printType(int x) {
        System.out.println(x + " is an int");
    }

    void printType(float x) {
        System.out.println(x + " is a float");
    }

    void printType(double x) {
        System.out.println(x + " is a double");
    }

    void printType(char x) {
        System.out.println(x + " is a char");
    }

    public static void main(String[] args) {
        typeTester t = new typeTester();
        byte b = 0b1010;
        t.printType(b);
    }
}
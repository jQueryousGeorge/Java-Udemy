package com.udemy.mycode;

public class Unicode
{
	public static void main (String[] args)
	{
//		char x = 0x03A0; // '0x' means this is hexadecimal
//		System.out.println(x); // x outputs a Greek character (symbol)
		
		for (char c = 0x0370; c <= 0x03FF; c++)
			System.out.print(c); // for loop to print all Greek chars
	}
}
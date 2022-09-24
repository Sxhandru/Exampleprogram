package com.java;

public class Fibonacci_Number {
	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for (int n = 2; n <=10; n++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}

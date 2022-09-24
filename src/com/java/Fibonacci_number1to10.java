package com.java;

public class Fibonacci_number1to10 {
	public static void main(String[] args) {
		int a=0,b=1,c;
		for (int n = 1; n <=10; n++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}

}

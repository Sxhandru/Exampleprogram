package com.java;

public class Biggest_Number {
	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40;
		if (a>b && a>c && a>d) {
			System.out.println("The Biggest Value "+ a);
		}
		else if (b>a && b>c && b>d) {
			System.out.println("The Biggest Value "+b);
		}
		else if (c>a && c>b && c>d) {
			System.out.println("The Biggest Value "+c);
			
		}
		else {
			System.out.println("The Biggest Value"+d);
		}
	}

}

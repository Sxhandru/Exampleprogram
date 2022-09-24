package com.java;

public class Palindrome_Number {
	public static void main(String[] args) {
		int n=11;
		int a=n,i=0,j=0;
		while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		if (j==n) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}

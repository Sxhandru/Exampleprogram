package com.java;

public class Sum_of_Digits {
	public static void main(String[] args) {
		int n =1234;
		int a=n,i=0,j=0;
		while (a>0) {
			i=a%10;
			j=j+i;
			a=a/10;
		}
		System.out.println(j);
	}

}

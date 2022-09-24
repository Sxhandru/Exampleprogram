package com.java;

public class Total_Amstrong_Number {
	public static void main(String[] args) {
		int c=0;
		for (int n = 1; n <=1000; n++) {
			int a=n,i=0,j=0;
			while (a>0) {
				i=a%10;
				j=(i*i*i)+j;
				a=a/10;
			}
			if (n==j) {
				c++;
			}
		}
		System.out.println("Total Amstrong Number");
		System.out.println(c);
	}

}

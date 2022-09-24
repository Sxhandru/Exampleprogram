package com.java;

public class Prime_number1to100 {
	public static void main(String[] args) {
		int count,c=0;
		for (int n = 1; n <=100; n++) {
			count=0;
			for (int j = 2; j <=n/2; j++) {
				if (n%j==0) {
					count++;
				}
			}
			if (count==0) {
				c++;
			}
		}
		System.out.println("Total Number Of prime Number  "+c);
	}

}

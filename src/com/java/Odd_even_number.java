package com.java;

public class Odd_even_number {
	public static void main(String[] args) {
		int evencount=0,oddcount=0;
		for (int n = 1; n <=100; n++) {
			if (n%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("Total Number of even number" + evencount);
		System.out.println("Totla NUmber of odd number " + oddcount);
	}

}

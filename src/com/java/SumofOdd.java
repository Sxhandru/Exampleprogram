package com.java;

public class SumofOdd {
	public static void main(String[] args) {
		int oddcount=0, evennumber=0;
		for (int i = 1; i <=100; i++) {
			if (i%2==1) {
				oddcount = oddcount+i;
			}
			else {
				evennumber=evennumber+i;
			}
		}
		System.out.println("Total Number of Oddcount  "+oddcount);
		System.out.println("Total Number of Evennumber"+evennumber);
	}

}

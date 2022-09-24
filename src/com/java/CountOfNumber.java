package com.java;

public class CountOfNumber {
	public static void main(String[] args) {
		int n =12345;
		int i=0;
		while (n>0) {
			n=n/10;
			i++;
		}
		System.out.println(i);
	}

}

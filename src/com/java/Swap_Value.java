package com.java;

public class Swap_Value {
	public static void main(String[] args) {
		int a=12,b=24,c;
		System.out.println("Orinigal Value");
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swap Value");
		System.out.println(a);
		System.out.println(b);
	}

}

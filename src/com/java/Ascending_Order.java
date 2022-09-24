package com.java;

public class Ascending_Order {
	public static void main(String[] args) {
		int temp;
		int n[]= {100,20,30,40,50,10,60,70,80,90,100,120,0};
		System.out.println("Ascending Order");
		for (int i = 0; i < n.length; i++) {
		System.out.print(n[i]+" ");
	}
		for (int j = 0; j < n.length; j++) {
			for (int k = j+1; k < n.length; k++) {
				if (n[j]>n[k]) {
					temp=n[j];
					n[j]=n[k];
					n[k]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Ascending Order");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
	}
}

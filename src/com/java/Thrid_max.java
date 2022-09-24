package com.java;

public class Thrid_max {
	public static void main(String[] args) {
		int temp;
		int n[]= {-12,45,-23,64,-100,24};
		System.out.println("Oringial Value");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
		for (int j = 0; j < n.length; j++) {
			for (int k = j+1; k < n.length; k++) {
				while (n[j]<n[k]) {
					temp =n[j];
					n[j]=n[k];
					n[k]=temp;
				}
			}
		}
		    System.out.println();
			System.out.println("In Order");
			for (int i = 0; i < n.length; i++) {
				System.out.print(n[i]+" ");
		}
			System.out.println("3rd maximum number is"+n[n.length - 4]);
	}

}

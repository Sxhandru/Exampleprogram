package com.java;

public class CharCount {
	public static void main(String[] args) {
		int Uppercase=0,lowercase=0,Numercal=0,Special=0;
		String S = "Hi Welcome To Java Classes Tommorow At 2.00p.m!!";
		for (int i = 0; i < S.length(); i++) {
		char charat = S.charAt(i);
		if (S.charAt(i)>= 'A' && S.charAt(i) <='Z') {
			Uppercase++;
		}
		else if (S.charAt(i) >='a' && S.charAt(i)<='z') {
			lowercase++;
		}
		else if (S.charAt(i)>='0' && S.charAt(i) <='9') {
			Numercal++;
		}
		else {
			Special++;
		}
			
		}
		System.out.println("Total Number of Uppercase   "+ Uppercase);
		System.out.println("Total Number of Lowercase   "+ lowercase);
		System.out.println("Total Number of Numercal    "+Numercal);
		System.out.println("Total Number of Special     "+Special);
		
	}

}

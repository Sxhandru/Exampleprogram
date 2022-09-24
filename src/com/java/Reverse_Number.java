package com.java;

public class Reverse_Number {
	public static void main(String[] args) {
		String S ="nishathi";
		String S1="";
		for (int n = S.length()-1; n >=0; n--) {
			S1=S1+S.charAt(n);
		}
		System.out.println(S1);
	}

}

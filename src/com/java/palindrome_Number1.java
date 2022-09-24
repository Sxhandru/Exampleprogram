package com.java;

public class palindrome_Number1 {
	 public static void main(String[] args) {
		String S = "madam";
		String S1= "";
		for (int n = S.length()-1; n >=0; n--) {
			S1=S1+S.charAt(n);
		}
		System.out.println(S1);
		if (S1.equals(S)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}

package com.java;

public class VowelsCount {
	public static void main(String[] args) {
		String S = "welcome";
		int Vowels=0, NonVowels=0;
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if (ch=='a' || ch =='A' || ch =='e' || ch== 'E' || ch =='i'  || ch== 'I'
				|| ch =='o' || ch == 'O' ||ch =='u' || ch=='U' ) {
				Vowels++;
			}
			else {
				NonVowels++;
			}
		}
		System.out.println("Total Number of Vowels   "+Vowels);
		System.out.println("Total Number of NonVowels"+NonVowels);	
		}
	}
	



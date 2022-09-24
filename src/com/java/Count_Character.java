package com.java;

import java.util.HashMap;

public class Count_Character {
	public static void main(String[] args) {
		String S ="vengatram";
		String[] allwords = S.split("");
        HashMap<String, Integer> C = new HashMap<String,Integer>();
        for (String words: allwords) {
        if (C.containsKey(words)) {
        	Integer value = C.get(words);
        	C.put(words, value+1);
	
}	
        else {
			C.put(words, 1);
		}
		}
        System.out.println(C);
	}

}

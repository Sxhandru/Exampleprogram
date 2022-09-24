package com.java;

import java.util.LinkedHashMap;

public class Each_word {
	public static void main(String[] args) {
		String S ="vengat ram";
		String[] allwords = S.split(" ");
		LinkedHashMap<String, Integer> C = new LinkedHashMap<String, Integer>();
        for (String words : allwords) {
        	if (C.containsKey(words)) {
				Integer value = C.get(words);
				C.put(words, value+1);
			}
        	else {
				C.put(words, 1);
			}
        	System.out.println(C);
			
		}			
		}
	}



package com.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class List_Duplicate {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");
		System.out.println("Total Number of the Frequency");
		Set<String> set = new LinkedHashSet<String>(list);
		for (String allset : set) {
			System.out.println(allset+ ":" + Collections.frequency(list, allset));
			
		}
	}

}

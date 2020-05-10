package cg.javaflp.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Set<Integer> s = new HashSet<Integer>();
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.add(10);
		s.add(14);
		s.add(12);
		s.add(8);
		
		System.out.println(s);
		
	}

}

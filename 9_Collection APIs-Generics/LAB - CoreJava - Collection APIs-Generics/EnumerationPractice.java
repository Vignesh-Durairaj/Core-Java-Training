package cg.javaflp.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;


public class EnumerationPractice {
	
	public static void main(String[] args) {
		
		List<String> a = new ArrayList<String>();
		
		a.add("Ram");
		a.add("Laxman");
		a.add("Bharat");
		a.add("Satrudhan");
		
		int i = 0;

		Iterator<String> itr = a.iterator();
		while (itr.hasNext()){
			String s = (String)itr.next();
			itr.remove();
			// s = s + " G";
			System.out.println(s);
		}
		
		System.out.println(a.size());
		
		Enumeration<String> en = Collections.enumeration(a);
		while (en.hasMoreElements()){
			String s = (String)en.nextElement();
			System.out.println(s);
		}
		
	}
}

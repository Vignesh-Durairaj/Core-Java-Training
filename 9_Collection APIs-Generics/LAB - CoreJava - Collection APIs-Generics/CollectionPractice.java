package cg.javaflp.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionPractice {

	public static void main(String[] args) {
		CollectionPractice cp = new CollectionPractice();
		cp.CollectionsClassPractice();
		
	}
	
	private void CollectionsClassPractice() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(19);
		list.add(12);
		list.add(5);
		list.add(8);
		
		System.out.println("Normal: " + list);

		Collections.swap(list, 2, 4);
		System.out.println("Swap: " + list);
		
		Collections.sort(list);
		System.out.println("Sort: " + list);
		
		Collections.reverse(list);
		System.out.println("Sort DECD: " + list);
		
		Collections.shuffle(list);
		System.out.println("Shuffle: " + list);
		
		List<Integer> list2 = new ArrayList<Integer>(5);
		Collections.copy(list2, list);
		System.out.println(list2);
	}

	private void sortedSetPrac(){
		SortedSet<AnyClass> ss = new TreeSet<AnyClass>();
		
		AnyClass ac = new AnyClass();
		AnySubClass asc = new AnySubClass();
		
		ss.add(asc);
		ss.add(ac);
		
		System.out.println(ss);
	}

}



class AnyClass implements Comparable {

	@Override
	public int compareTo(Object o) {
		return 1;
	}
	
}

class AnySubClass extends AnyClass {
	
}

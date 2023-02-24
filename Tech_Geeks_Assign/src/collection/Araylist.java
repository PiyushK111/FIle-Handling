package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Araylist {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>(5);
		a1.add("blue");
		a1.add("red");
		a1.add("green");
		System.out.println(a1);// Q 1
		Iterator<String> itr = a1.iterator();
		while (itr.hasNext()) {
			System.out.println("Using Iterator  : " + itr.next()); // Q 2
		}
		a1.add(0, "1");
		System.out.println("Additing at first posi : " + a1); // Q3
		System.out.println("Element at the index 3: " + a1.get(3));
		System.out.println("Upadate elemt : " + a1.set(2, "5"));
		System.out.println(a1);
		System.out.println("remove element at posi 1: " + a1.remove(1));
		System.out.println(a1);
		System.out.println(a1.contains(5));
		Collections.sort(a1);
		System.out.println("sort :" + a1);
		Collections.reverse(a1);
		System.out.println("reverse :" + a1);
		ArrayList<String> a2 = new ArrayList<String>(10);
//	Collections.copy(a1, a2);
//	Collections.copy(a2,a1);                 Doubt
		Object[] arr1 = a1.toArray(); // convert into array { toarray method };
		for (Object i : arr1) {
			System.out.println(i);
		}
		// System.out.println(a2);
		Collections.shuffle(a1);
		System.out.println("Shuffeled List : " + a1);
		// a1.trimToSize();
		System.out.println(a1.size());
		System.out.println("Comparison is doubt00");

		System.out.println("Initially a1 is : " + a1);
		Collections.swap(a1, 0, 1);
		System.out.println("After swappig :" + a1);
		a2.add("piyush");
		a2.add("Aj");
		a2.addAll(a1);
		System.out.println("using Addall method : " + a2);

	}
}

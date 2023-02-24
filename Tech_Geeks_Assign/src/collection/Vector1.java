package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector();
		v1.add("Monday");
		v1.add("Tuesday");
		v1.add("Wednesday");
		v1.add("Thursday");
		v1.add("Friday");
		v1.add("Saturday");
		v1.add("January");
		v1.add(3, "Sunday");
		v1.add(4, "Oneday");
		v1.add("Monday");
		v1.add("Friday");
		Iterator i1 = v1.iterator();
		// Month m0 = (Month)v1.get(0);
		// Month m1 = (Month)v1.get(1);
		// Month m2 = (Month)v1.get(2);
		// System.out.println(m0);
		// System.out.println(m1);
		// System.out.println(m2);
		System.out.println(v1.get(0));
		System.out.println(i1.hasNext());
		System.out.println(v1.get(3));
		System.out.println("Element Removed  : " + v1.remove(1));
		System.out.println("Is empty ?: " + v1.isEmpty());
		System.out.println("IS present : " + v1.contains("Friday"));
		// System.out.println("is given element present i.e Friday:"+
		// v1.contains((Month)v1.get(4)));
		// Collections.sort(v1); //Sorting

		// System.out.println(v1);
		Vector1 v2 = new Vector1();
		v2.FindDuplicates(v1);
	}

	private void FindDuplicates(Vector v1) { // TODO Auto-generated method stub
		HashMap<String, Integer> m1 = new HashMap();

		for (int i = 0; i < v1.size(); i++) {
			Integer c = m1.get((String) v1.get(i));
			if (c == null) {
				m1.put((String) v1.get(i), 1);
			} else {
				m1.put((String) v1.get(i), ++c);
			}
		}
		System.out.println("Elments with there Frequency : \n" + m1);

		for (Map.Entry<String, Integer> i : m1.entrySet()) {

			if (i.getValue() > 1) {
				System.out.println("Duplicate Elements is with frequency: " + i);
			}
		}

		Stack<Integer> l1 = new Stack<Integer>();
		l1.add(1);
		l1.add(2);
		// System.out.println(l1);
		Integer c = l1.capacity();
		System.out.println(c);
		l1.push(78);
		l1.push(100);
		System.out.println(l1);
		System.out.println(l1.pop());
		System.out.println(l1);

		class Month {
			String days;

			public Month(String days) {
				super();
				this.days = days;
			}

			@Override
			public String toString() {
				return "Month [days=" + days + "]";
			}

		}

		/*
		 * class Year{ String Month;
		 * 
		 * public Year(String month) { super(); Month = month; }
		 * 
		 * @Override public String toString;() { return "Year [Month=" + Month + "]"; }
		 */

	}
}

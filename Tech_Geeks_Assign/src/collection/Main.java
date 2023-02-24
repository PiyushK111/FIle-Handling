package collection;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Piyush", 1);
		m1.put("Manoj", 2);
		m1.put("Ajinkya", 3);
		m1.put("Kunal", 4);
		m1.put("Nehal",5);
		System.out.println(m1);
	//Set<Map.Entry<String,Integer>> e1=m1.entrySet();		
		//Map.Entry<String, Integer> e1 = m1.entrySet();
		for ( Map.Entry<String , Integer> e2 : m1.entrySet()) {
		//	System.out.println(e2.getKey()+"==" + e2.getValue());
			System.out.println(e2.getValue());
			//System.out.println(e2.getClass());
		}
}
}

/* Java program to print frequencies of all elements using 
HashMap */
package collection;

import java.util.*;

public class GFG {
	// This function prints frequencies of all elements
	static void printFreq(int arr[]) {
		// Creates an empty HashMap
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {
			Integer c = hmap.get(arr[i]);
			// System.out.println("Value of Integer C : "+c);
			// If this is first occurrence of element
			if (c == null)
				hmap.put(arr[i], 1);

			// If elements already exists in hash map
			else
				hmap.put(arr[i], ++c);
		}

		// Print result
		for (Map.Entry m : hmap.entrySet())
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
	}

	// Driver method to test above method
	public static void main(String[] args) {
		int arr[] = { 10, 10, 10, 10, 5, 5, 34, 5, 10, 3, 5, 10 };
		printFreq(arr);

	}
}

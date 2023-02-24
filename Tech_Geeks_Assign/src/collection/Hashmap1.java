package collection;

import java.util.HashMap;

public class Hashmap1
{
	int c=0;
	public void count(int arr1[]) {
		HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();
		for ( int i = 0 ;i<arr1.length;i++ )
		{		
		Integer	c= h1.get(arr1[i]);
			
			if( c==null) {
				h1.put(arr1[i], 1);
			}
			else {
				h1.put(arr1[i], ++c);
			}
			
		}
		System.out.println(h1.entrySet());
		
		
	}
	

	public static void main(String[] args) {
		
		Hashmap1 h1 = new Hashmap1();
		int arr[] = new int[] {1,1,1,2,3,5,4,5,5,6};
		h1.count(arr);
	//	public void print();
	}
}

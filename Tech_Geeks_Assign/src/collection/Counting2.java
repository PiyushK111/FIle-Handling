package collection;

import java.util.Vector;

public class Counting2 {
	
	public void count(int arr[]) {

		 Vector<Integer> v1 = new Vector<Integer>();
		for (int i = 0 ;i<arr.length;i++) {
			if(v1.contains(arr[i])) {
				Integer c= 1;
			}
			else {
				
			}
		}
		
		
}
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		Counting2 h1 = new Counting2();
		int arr1[]= new int[] {1,1,1,3,3,4,4,2,1,3,4,5};
		h1.count(arr1);
	}
}

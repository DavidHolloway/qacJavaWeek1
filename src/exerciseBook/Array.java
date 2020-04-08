package exerciseBook;

import java.util.ArrayList;

public class Array {
	
	public int[] iterateNum(int a, int b) {
		
		int[] array = new int[b+1];
		
		for (int i=1; i<=100; i++) {
			array[i] = i;
			System.out.println(array[i]);
		
		}		
		
		return array;		
	}
	
	
	public ArrayList<Integer> myList(){
		
		int j = 0;
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    
	    for (int i =100; i<=999; i++) {
	    	numbers.add(i);
	    	System.out.println(numbers.get(j)*10);
	    	j++;	    	
	    }

		return numbers;		
	}
	
	

}

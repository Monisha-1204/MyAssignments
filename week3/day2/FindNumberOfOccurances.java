package week3.day2;

import java.util.TreeMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		TreeMap<Integer, Integer> n=new TreeMap<Integer, Integer>();
		int arr[]={2,3,5,6,3,2,1,4,2,1,6,-1};
		for (int i : arr) {
			if(!n.containsKey(i))
			{
				n.put(i, 1);

			}			else
			{
				n.put(i, n.get(i)+1);	
			}
		}
		System.out.println("Number of occurance each number is :"  +n.entrySet());
	}

}
/*
 * Input array numbers, each occurances
 * 
 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
 * 
 * Order: Ascending Order
 * 
 */

/*
 * Psuedcode:
 * 
 * a) Create Map -> TreeMap
 * b) For loop -> each number -> add to the map
 * c) If it is exist -> update it with + 1
 * 	  Else -> new entry with 1 as value
 */
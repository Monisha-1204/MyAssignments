package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Psuedocode
		 * * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		int[] a = { 3, 2, 6, 4, 6, 7, 2, 3, 9, 6, 7,1};
		Set<Integer> n = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			n.add(a[i]);

		}
		List<Integer> list=new ArrayList<Integer>(n);
		int s=list.size();
		System.out.println("Missing number is :" );
		for (int i = 0; i < s-1; i++) {
			if (list.get(i) == list.get(i + 1) - 1) {
				continue;
			} 
			else
			{
				System.out.println(list.get(i)+1);
			}

		}

	}

}



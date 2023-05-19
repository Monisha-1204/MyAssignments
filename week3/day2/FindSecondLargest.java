package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {


		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };

		Set<Integer> n = new TreeSet<Integer>();

		for (int i = 0; i < data.length; i++) {

			n.add(data[i]);
		}

		List<Integer> list1 = new ArrayList<Integer>(n);

		Collections.sort(list1);

		System.out.println("Second Largest number ");

		System.out.println(list1.get(list1.size()-2));
	}	
}
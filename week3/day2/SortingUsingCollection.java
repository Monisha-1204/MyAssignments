package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		
		// get the length of the array		
		// sort the array			
		// Iterate it in the reverse order
		// print the array
		// Required Output: TestLeaf, Microsoft, Maverick, Google
		
		String[] ch= {"Google","Microsoft","TestLeaf","Maverick"};
		List<String> list=new ArrayList<String>(Arrays.asList(ch));
		List<String> list1=new ArrayList<>();
		Collections.sort(list);
		for(int i=list.size()-1;i>=0;i--) {
			String str=list.get(i);
			list1.add(str);
		}
		System.out.println(list1);

	}
}

package week3.day2;

import java.util.HashSet;
import java.util.Set;
//done
public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="babu";
		char[] ch=str.toCharArray();
		Set<Character> n=new HashSet<Character>();
		Set<Character> duplicates=new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {

			boolean add = n.add(ch[i]);
			if(!add)
			{
				duplicates.add(ch[i]);
			}
		}
		n.removeAll(duplicates);
		System.out.println("Unique characters are : " + n);
	}
}
/*
 * Problem
 * a) Take your name as input
 * b) Print all unique characters only (any order)
 * Input:  babu
 * Output: a u 
 Psuedocode
 * 
 * a) Convert String to Character array
 * b) Create a new Set -> HashSet
 * c) Add each character to the Set and if it is already there, remove it
 * d) Finally, print the set
 * 
 */
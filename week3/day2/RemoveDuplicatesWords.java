package week3.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
//done
public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="We learn java basics as part of java sessions in java week1";
		String[] ch=str.split(" ");
		{
			Set<String> s=new LinkedHashSet<>();
			for (int i = 0; i < ch.length; i++) {
				s.add(ch[i]);
			}

			System.out.println("Unique characters are : " + s);
		}
	}
}

/*
 * Pseudo code 

 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";
 *
 *Output= We learn java basics as part of sessions in week1
 *
 * Psuedocode
 *
 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
 * c) Create a empty Set 
 * d) Iterate the String array
             d.1) add each word into Set
 * e) Print the Set values which is having unique words
 */
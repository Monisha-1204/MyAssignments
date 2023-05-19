package week3.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
//done
public class FindIntersection{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] arraylist1 = {3,2,11,4,6,7};
		int [] arraylist2 = {1,2,8,4,9,7};
		int length1 = Array.getLength(arraylist1);
		int length2 = Array.getLength(arraylist2);
		System.out.print("Common Values:");
		for (int i=0; i< length1; i++)
		{
			for (int j = 0; j<length2; j++)
				{ if (arraylist1[i] == arraylist2[j])
					{
						
						System.out.println(arraylist1[i]);
					}
				}
		}
		
	}


}



package daily.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr.length!=arr[i])
			{
				j=i+1;
				if(arr[i]!=j) {
					System.out.println("The missing element in an Array is: " +j);
					break;
				}	
			}

		}}}


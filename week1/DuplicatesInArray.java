package daily.assignment;

import java.util.Arrays;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len=arr.length;
		Arrays.sort(arr);
		System.out.println("The duplicate array values are:");
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len-1;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}




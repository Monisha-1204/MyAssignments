package daily.assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String str = "changeme";
		System.out.println("The Odd Index To UpperCase Is:");
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++){
			if(i%2!=0) {
				System.out.print( Character.toUpperCase(ch[i])); 
			}
			else
			{
				System.out.print(ch[i]);
			}
		}
	}
}  

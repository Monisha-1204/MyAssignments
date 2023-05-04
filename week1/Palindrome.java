package daily.assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="Madam";
		String rev = "";
		char c[]=S.toCharArray();
		for(int i =c.length-1;i>=0;i--) {
			rev+=c[i];

		}
		if(S.equalsIgnoreCase(rev))
		{
			System.out.println("The string is Palindrome: " +S);
		}
		else
		{
			System.out.println("The string  is not Palindrome: " +S);
		}
	}

}

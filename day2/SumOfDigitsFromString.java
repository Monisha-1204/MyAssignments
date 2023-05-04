package daily.assignment;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
		int i, sum =0;
		String str=text.replaceAll("\\D", "");

		char[] ch=str.toCharArray();
		System.out.println("Numeric Values are: ");

		System.out.println(ch);

		for(i=0;i<ch.length;i++) {
			int a = Character.getNumericValue(ch[i]);
			sum=sum+a;
		}
		System.out.println("Sum of Digits is: " + sum);
	}

}

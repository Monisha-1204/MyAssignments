package daily.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] S=test.split(" ");
		for(int i=0;i<S.length;i++) {
			if(i%2==1) {
				char[] c=S[i].toCharArray();
				S[i]="";
				for(int j=c.length-1;j>=0;j--){
					S[i]+=c[j];
				}
			}

			System.out.print( S[i]);
			if(i<S.length-1) {
				System.out.print(" ");
			}
		}

	}	
}
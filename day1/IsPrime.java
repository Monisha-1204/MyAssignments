package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=54;
		boolean isPrime=true;
		for(int i=2;i<num-1;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println("The " +num +" is a Prime Number" );
		else
			System.out.println("The " +num +" is not a Prime Number" );

	}

}

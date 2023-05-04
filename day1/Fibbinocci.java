package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum= 0, secondNum= 1,sum=0;
		for(int i=1;i<=11;i++) {
			System.out.println(firstNum);
			sum = firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
		}
	}

}

package daily.assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] ch=str.split(" ");
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i].equalsIgnoreCase(ch[j]))
				{
					ch[j]="";
					count++;
				}
			}}
		if(count>0)
		{
			for(int k=0;k<ch.length;k++) {
				System.out.print(ch[k] +" ");

			}
		}

	}

}


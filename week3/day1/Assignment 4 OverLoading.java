package week3.assignment;

public class OverLoading {
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("Student id is : "+id);
	}
	public void getStudentInfo(int id,String name)
	{
		//System.out.println("Student id is : "+id);

		System.out.println( "Student Name is : "+name);
	}
	public void getStudentInfo(String email,long phoneno)
	{
		System.out.println("Emailid is: " +email);

		System.out.println( "Phoneno is: " +phoneno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading ol=new OverLoading();
		ol.getStudentInfo(12345);
		ol.getStudentInfo(12345, "Nisha");
		ol.getStudentInfo("nisha@gmail.com", 12132848462l);
	}

}

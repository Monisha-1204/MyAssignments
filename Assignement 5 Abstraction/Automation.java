package week3.assignment;

public class Automation extends MultipleLanguage{

	
	

	@Override
	public void java() {
		System.out.println("This java method from : Language interface");	
	}

	@Override
	public void selenium() {
		System.out.println("This selenium method from : TestTool interface");	
		
	}

	@Override
	public void ruby() {
		System.out.println("This ruby method from : MultipleLangaue Abstract class");	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Automation au=new Automation();
au.java();
au.python();
au.selenium();
au.ruby();

}
}
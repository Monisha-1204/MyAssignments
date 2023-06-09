package week4.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args)     {
		// TODO Auto-generated method stub
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		// TODO Auto-generated method stub
		ChromeDriver d =new ChromeDriver();
		
		//1. Load url "https://acme-test.uipath.com/login"
		d.get("http://leaftaps.com/opentaps/control/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.findElement(By.id("username")).sendKeys("demoSalesManager");
		d.findElement(By.id("password")).sendKeys("crmsfa");

		//3. Click on Login Button using Class Locator
		d.findElement(By.className("decorativeSubmit")).click();

		//4. Click on CRM/SFA Link
		d.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//5. Click on contacts Button
		d.findElement(By.linkText("Create Contact")).click();
		
		// * 6. Click on Merge Contacts using Xpath Locator
		d.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		// * 7. Click on Widget of From Contact
		d.findElement(By.xpath("//span[text()='From Contact']/following::img")).click();
		Set<String> windowHandles = d.getWindowHandles();
		List<String> con=new ArrayList<String>(windowHandles);
		d.switchTo().window(con.get(1));
		
		//* 8. Click on First Resulting Contact
		d.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
		//* 9. Click on Widget of To Contact
		d.switchTo().window(con.get(0));
		d.findElement(By.xpath("//span[text()='To Contact']/following::img")).click();
		Set<String> windowHandles1 = d.getWindowHandles();
		List<String> con1=new ArrayList<String>(windowHandles1);
		

		//* 10. Click on Second Resulting Contact
		d.switchTo().window(con1.get(1));
		d.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[3]")).click();
		d.switchTo().window(con.get(0));
		
		//* 11. Click on Merge button using Xpath Locator
		d.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		//* 12. Accept the Alert
		d.switchTo().alert().accept();

		//* 13. Verify the title of the page
		String title= d.getTitle();
		System.out.println("The title of the page is: "+ title);
	}

}

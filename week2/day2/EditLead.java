package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		/*http://leaftaps.com/opentaps/control/main
//		d.get("http://leaftaps.com/opentaps/control/login");
		ChromeDriver d = new ChromeDriver();
		
		 
		//Delete Lead:
		//1	Launch the browser
		d.get("http://leaftaps.com/opentaps" );
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
//		* 2	Enter the username
		d.findElement(By.id("username")).sendKeys("demoSalesManager");
		
//		* 3	Enter the password
		d.findElement(By.id("password")).sendKeys("crmsfa");

		//4. Click on Login Button 
		d.findElement(By.className("decorativeSubmit")).click();

		//5. Click on CRM/SFA Link
		d.findElement(By.partialLinkText("CRM/SFA")).click();
		
//		* 6	Click Leads link
		d.findElement(By.linkText("Leads")).click();

//		* 7	Click Find leads
		d.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		* 8	Enter first name
		d.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("Harish");
		
		//* 9	Click Find leads button
		d.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
//		* 10 Click on first resulting lead
		d.findElement(By.xpath("(//div[contains(@class, 'x-grid3-row')])[1]//td[3]//a")).click();
		
//		* 11 Verify title of the page
		String title = d.getTitle();
		System.out.println(title);
		
		//* 12 Click Edit
		Thread.sleep(3000);

		d.findElement(By.xpath("//a[text()='Edit']")).click();
		//d.findElement(By.xpath("(//div[@class='frameSectionExtra']//a)[3]")).click();
		
//		* 13 Change the company name
		d.findElement(By.xpath("//span[text()='Company Name']/following::input")).clear();
		d.findElement(By.xpath("//span[text()='Company Name']/following::input")).sendKeys("testleaf");

		//		* 14 Click Update
		d.findElement(By.className("smallSubmit")).click();
		
//		* 15 Confirm the changed name appears
		String companyName = d.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(companyName);
//		* 16 Close the browser (Do not log out)
		d.close();

	}
}
	
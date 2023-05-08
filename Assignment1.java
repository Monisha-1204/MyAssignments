package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Assignment 1:Create Lead
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		d.get("http://leaftaps.com/opentaps/control/login");
		
		//2. Enter UserName and Password Using Id Locator
		d.findElement(By.id("username")).sendKeys("demoSalesManager");
		d.findElement(By.id("password")).sendKeys("crmsfa");

		//3. Click on Login Button using Class Locator
		d.findElement(By.className("decorativeSubmit")).submit();

		//4. Click on CRM/SFA Link
		d.findElement(By.partialLinkText("CRM/SFA")).click();

		//5. Click on Leads Button


		d.findElement(By.linkText("Leads")).click();
		//6. Click on Create Lead 
		
		d.findElement(By.linkText("Create Lead")).click();
		//7. Enter CompanyName Field Using id Locator
		d.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		
		//8. Enter FirstName Field Using id Locator
		d.findElement(By.id("createLeadForm_firstName")).sendKeys("Nisha");

		//9. Enter LastName Field Using id Locator
		d.findElement(By.id("createLeadForm_lastName")).sendKeys("Natesan");

		//10. Enter FirstName(Local) Field Using id Locator
		d.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Monisha");

		//11. Enter Department Field Using any Locator of Your Choice
		d.findElement(By.id("createLeadForm_departmentName")).sendKeys("HR");

		//12. Enter Description Field Using any Locator of your choice 
		d.findElement(By.id("createLeadForm_description")).sendKeys("Welcome to Testleaf");

		//13. Enter your email in the E-mail address Field using the locator of your choice
		d.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nisha@testleaf.com");

		
		//14. Select State/Province as NewYork Using Visible Text
		WebElement state = d.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select  s= new Select(state);
		s.selectByVisibleText("Alaska");

		//15. Click on Create Button
		d.findElement(By.className("smallSubmit")).click();
		
	     // 16. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		String title=d.getTitle();
		System.out.println(title);

	}

}

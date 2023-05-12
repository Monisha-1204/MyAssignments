package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
	
ChromeDriver d = new ChromeDriver(); 
d.get("http://leaftaps.com/opentaps/control/login");
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

// 2. Enter UserName and Password Using Id Locator
d.findElement(By.id("username")).sendKeys("demoSalesManager");
d.findElement(By.id("password")).sendKeys("crmsfa");

//3. Click on Login Button using Class Locator
d.findElement(By.className("decorativeSubmit")).click();

//4. Click on CRM/SFA Link
d.findElement(By.partialLinkText("CRM/SFA")).click();

//5. Click on contacts Button
	d.findElement(By.linkText("Contacts")).click();

// * 6. Click on Create Contact
	d.findElement(By.linkText("Create Contact")).click();

// 7. Enter FirstName Field Using id Locator
	d.findElement(By.id("firstNameField")).sendKeys("Nisha");

///		 * 8. Enter LastName Field Using id Locator
	d.findElement(By.id("lastNameField")).sendKeys("Natesan");

//* 9. Enter FirstName(Local) Field Using id Locator
	d.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Nisha");

//		 * 10. Enter LastName(Local) Field Using id Locator
	d.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Nisha");

//		  * 11. Enter Department Field Using any Locator of Your Choice
	d.findElement(By.id("createContactForm_departmentName")).sendKeys("HR");
//* 12. Enter Description Field Using any Locator of your choice 

	d.findElement(By.id("createContactForm_description")).sendKeys("Welcome to Testleaf");
	//13. Enter your email in the E-mail address Field using the locator of your choice
	d.findElement(By.id("createContactForm_primaryEmail")).sendKeys("nisha@testleaf.com");

	// * 14. Select State/Province as NewYork Using Visible Text
	WebElement state = d.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select  s= new Select(state);
	s.selectByVisibleText("Alaska");

	// * 15. Click on Create Contact
	d.findElement(By.className("smallSubmit")).click();

	//* 16. Click on edit button 
	d.findElement(By.xpath("//a[@class='subMenuButton']")).click();
	
	//* 17. Clear the Description Field using .clear
	d.findElement(By.id("updateContactForm_description")).clear();
	
	//		 * 18. Fill ImportantNote Field with Any text
	d.findElement(By.id("updateContactForm_importantNote")).sendKeys("Hello");
	 
	//* 19. Click on update button using Xpath locator
	d.findElement(By.xpath("//input[@value='Update']")).click();
	
	// * 20. Get the Title of Resulting Page.
	String title= d.getTitle();
	System.out.println(title);

	}

}

		
		
package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//Assignment 2:Duplicate Lead
ChromeDriver d = new ChromeDriver();
d.manage().window().maximize();

//1. Launch URL "http://leaftaps.com/opentaps/control/login"
d.get("http://leaftaps.com/opentaps/control/login");

//2. Enter UserName and Password Using Id Locator
d.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
d.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");	

//3. Click on Login Button using Class Locator
d.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

//4. Click on CRM/SFA Link
d.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();

//5. Click on Leads Button
d.findElement(By.xpath("//a[text()='Leads']")).click();

//6. Click on Create Lead 
d.findElement(By.xpath("//a[text()='Create Lead']")).click();

//7. Enter CompanyName Field Using id Locator
d.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("testleaf");

//8. Enter FirstName Field Using id Locator
d.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Nisha");

//9. Enter LastName Field Using id Locator
d.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Natesan");

//10. Enter FirstName(Local) Field Using id Locator
d.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Monisha");

//11. Enter Department Field Using any Locator of Your Choice
d.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("HR");

//12. Enter Description Field Using any Locator of your choice 
d.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Welcome to Testleaf");

//13. Enter your email in the E-mail address Field using the locator of your choice
d.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("nisha@testleaf.com");


//14. Select State/Province as NewYork Using Visible Text
WebElement state = d.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select  s= new Select(state);
s.selectByVisibleText("Alaska");

//15. Click on Create Button
d.findElement(By.xpath("//input[@name='submitButton']")).click();


//17. Click on Duplicate button
d.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();


//18. Clear the CompanyName Field using .clear() And Enter new CompanyName
 d.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).clear();

 d.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("leaftest");

//19.Clear the FirstName Field using .clear() And Enter new FirstName
 d.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).clear();
 d.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Monisha");

//20.Click on Create Lead Button
	d.findElement(By.xpath("//input[@name='submitButton']")).click();

    // 21. Get the Title of Resulting Page. refer the video  using driver.getTitle()
	String title=d.getTitle();
	System.out.println(title);

 }}
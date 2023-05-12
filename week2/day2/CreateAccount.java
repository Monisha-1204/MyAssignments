package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d = new ChromeDriver(); 

		//		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
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
 
		//		 * 5. Click on Accounts Button
		d.findElement(By.xpath("//a[text()='Accounts']")).click();		
		
		//		 * 6. Click on Create Account
		 d.findElement(By.xpath("//a[text()='Create Account']")).click();

		 //		 * 7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		 d.findElement(By.xpath("//span[text()='Account Name']/following::input")).sendKeys("Debit Limited Account3");
		 
		 //		 * 8. Enter DEscriptiion as "Selenium Automation Tester"
		 d.findElement(By.xpath("//span[text()='Description']/following::textarea")).sendKeys("Selenium Automation Tester");
 
		 //		 * 9. Enter LocalName Field Using Xpath Locator
		 d.findElement(By.xpath("//span[text()='Local Name']/following::input")).sendKeys("Monisha");
		 
		 //		 * 10. Enter SiteName Field Using Xpath Locator
		 d.findElement(By.xpath("//span[text()='Site Name']/following::input")).sendKeys("Natesan");

		 //		 * 11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		 d.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("500000");

		 //		 * 12. Select Industry as ComputerSoftware
		d.findElement(By.xpath("//span[text()='Industry']/following::select")).sendKeys("ComputerSoftware");

		//		 * 13. Select OwnerShip as S-Corporation using SelectByVisibletext
		 WebElement own =d.findElement(By.name("ownershipEnumId"));
		 Select set1 =new Select(own);
		 set1.selectByVisibleText("S-Corporation");
		 
		 // * 14. Select Source as Employee using SelectByValue
		 WebElement s =d.findElement(By.id("dataSourceId"));
		 Select set2 =new Select(s);
		 set2.selectByValue("LEAD_EMPLOYEE");
		 
		 //		 * 15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		 WebElement market =d.findElement(By.id("marketingCampaignId"));
		 Select set3 =new Select(market);
		 set3.selectByIndex(6);
		 
		 //		 * 16. Select State/Province as Texas using SelectByValue 
		 WebElement state =d.findElement(By.id("generalStateProvinceGeoId"));
		 Select set4 =new Select(state);
		 set4.selectByValue("TX");
		 
		 //		 * 17. Click on Create Account using Xpath Locator
		 d.findElement(By.className("smallSubmit")).click();
	}

}

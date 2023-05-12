package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		 
		//Delete Lead:
		//1	Launch the browser
		driver.get("http://leaftaps.com/opentaps" );
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//2	Enter the username
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");

		//3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//4	Click Login
		driver.findElement(By.className("decorativeSubmit")).submit();

		//5	Click crm/sfa link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		//6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//8	Click on Phone
		driver.findElement(By.linkText("Phone")).click();
		
		//9	Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		
		//10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		// 11 Click First Resulting lead of First Resulting lead

		WebElement leadId = driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-row')])[1]//td[1]//a"));
		String leadIdValue = leadId.getText();
		System.out.println(leadIdValue);

		driver.findElement(By.xpath("//a[text()='" + leadIdValue + "']")).click();

		// 12 Click Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();

		//13 Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);

		//14 Enter captured lead ID
		driver.findElement(By.name("id")).sendKeys(leadIdValue);

		//15 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);

		//16 Verify message "No records to display" in the Lead List. This message
		// confirms the successful deletion
		 driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		

		// 17 Close the browser (Do not log out)
		driver.close();
	}

}

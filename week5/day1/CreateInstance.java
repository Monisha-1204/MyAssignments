package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class CreateInstance {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver  = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//. Launch ServiceNow application Go to developer.servicenow.com
		driver.get("https://dev131530.service-now.com");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='TrustArc Cookie Consent Manager']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//a[text()='Required Only']")).click();
		driver.findElement(By.xpath("//a[text()='Close']")).click();
	
		//2. Login with valid credentials (refer the document to create the instance)
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Nisha@123");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
		//3. Enter Incident in filter navigator and press enter"
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Incident",Keys.ENTER);
		shadow.findElementByXPath("//span[text()='Create New']").click();		

		//4. Click on Create new option and fill the manadatory fields		
		WebElement iframe1 = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(iframe1);
		String text1 = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println("Incident Number is : "+text1);		
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("Hi..");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.switchTo().defaultContent();
		
		//5. Verify the newly created incident ( copy the incident number and paste it in search field and enter 
		//then verify the instance number created or not)
		WebElement iframe2 = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(iframe2);
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(text1,Keys.ENTER);
		driver.switchTo().defaultContent();
		WebElement iframe3 = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(iframe3);
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//a[text()='Number']/following::a[@class='linked formlink']")).getText();
		System.out.println("The verified incident is: "+text+" and both are mactched");
		driver.close();
		
	}

}

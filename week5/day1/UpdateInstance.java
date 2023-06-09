package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class UpdateInstance {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver  = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//1. Launch ServiceNow application Go to developer.servicenow.com
		driver.get("https://dev131530.service-now.com");
		
		//2. Login with valid credentials //2.Update existing incident

		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='TrustArc Cookie Consent Manager']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//a[text()='Required Only']")).click();
		driver.findElement(By.xpath("//a[text()='Close']")).click();		
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Nisha@123");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
		//3. Enter Incident in filter navigator and press enter "
		
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//span[text()='Incidents']").click();
		//4. Search for the existing incident and click on the incident
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='linked formlink'])[6]")).click();
		//5. Update the incidents with Urgency as High and State as In Progress
		
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//a[@class='linked formLink']").click();
		
		shadow.setImplicitWait(10);
		WebElement incidentstatus = shadow.findElementByXPath("//select[@id='incident.Urgency']");
		Select Source=new Select(incidentstatus);
		Source.selectByIndex(0);
		
		shadow.setImplicitWait(10);
		WebElement state = driver.findElement(By.xpath("(select[@id='incident.state']"));
		Select num=new Select(state);
		num.selectByIndex(1);
		
		shadow.setImplicitWait(10);
		WebElement op1 = driver.findElement(By.xpath("(//span[@class='label-text'])[7]"));
		Select num1=new Select(op1);
		num1.selectByIndex(1);
		
	}

}


package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 1: Download and set the path 
	// Step 2: Launch the chromebrowser
		ChromeDriver d=new ChromeDriver();
		
	
	// Step 3: Load the URL https://en-gb.facebook.com/
		d.get("https://en-gb.facebook.com/");
		d.findElement(By.xpath("//button[@title='Allow all cookies']")).click();

	// Step 4: Maximise the window
		d.manage().window().maximize();

	// Step 5: Add implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	// Step 6: Click on Create New Account button
		d.findElement(By.linkText("Create new account")).click();
		
	// Step 7: Enter the first name
		d.findElement(By.name("firstname")).sendKeys("Nisha");
		
	// Step 8: Enter the last name
		d.findElement(By.xpath("(//input[@data-type='text'])[2]")).sendKeys("Natesan");
		
	// Step 9: Enter the mobile number
		d.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("+919876543210");
		
	// Step 10: Enter the password
		d.findElement(By.xpath("//div[text()='New password']/following::input")).sendKeys("RmS1204");
		
	 //Step 11: Handle all the three drop downs
		d.findElement(By.xpath("//select[@id='day']")).sendKeys("10");
		d.findElement(By.xpath("//select[@id='month']")).sendKeys("Jan");
		d.findElement(By.xpath("//select[@id='year']")).sendKeys("1990");
		
	// Step 11: Handle all the three drop downs
		WebElement day = d.findElement(By.id("day"));
		Select D = new Select(day);
		D.selectByValue("20");

		WebElement month = d.findElement(By.id("month"));
		Select M= new Select(month);
		M.selectByIndex(5);
		
	
		WebElement year = d.findElement(By.id("year"));
		Select Y = new Select(year);
	Y.selectByValue("1995");
	

	// Step 12: Select the radio button "Female" ( A normal click will do for this step) 
		d.findElement(By.xpath("//label[text()='Female']")).click();
		
		String title= d.getTitle();
		System.out.println(title);
	}

}

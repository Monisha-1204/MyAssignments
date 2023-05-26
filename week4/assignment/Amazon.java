package week4.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import com.sun.tools.javac.util.Options;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		//1. click the url
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2.search as oneplus 9 pro 
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
		//3.Get the price of the first product
		String price = d.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
		System.out.println("Product Price : "+price);
		
		//4. Print the number of customer ratings for the first displayed product
		String custReview = d.findElement(By.xpath("//span[@class='a-size-base s-underline-text'][1]")).getText();
		System.out.println("Customer Review :"+custReview);
		
		//5. Click the first text link of the first image
		d.findElement(By.xpath("//img[@class='s-image'][1]")).click();
		Thread.sleep(4000);
		Set<String> windowHandles = d.getWindowHandles();
		List<String> list1=new ArrayList<String>(windowHandles);
		d.switchTo().window(list1.get(1));
		
		//6. Take a screen shot of the product displayed
		File s=d.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshots/firstmobile.png");
		FileUtils.copyFile(s, des);

		//7. Click 'Add to Cart' button
		d.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		//8. Get the cart subtotal and verify if it is correct.
		Thread.sleep(4000);
		WebElement subTotal = d.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		String str=subTotal.getText();
		System.out.println("SubTotoal : " +str);
		
		//9.close the browser
		d.close();
	}
}

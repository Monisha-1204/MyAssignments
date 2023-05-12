package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d =new ChromeDriver();
		//1. Load url "https://acme-test.uipath.com/login"
		d.get("https://acme-test.uipath.com/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//2. Enter email as "kumar.testleaf@gmail.com"
		d.findElement(By.xpath("//label[text()='Email:']/following-sibling::input")).sendKeys("kumar.testleaf@gmail.com");
		//3. Enter Password as "leaf@12"
		d.findElement(By.xpath("//label[text()='Password:']/following-sibling::input")).sendKeys("leaf@12");
		//4. Click login button
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
		//5. Get the title of the page and print
		String title = d.getTitle();
		System.out.println(title);
		//6. Click on Log Out
		d.findElement(By.xpath("//a[text()='Log Out']")).click();
		//7. Close the browser (use -driver.close())
		d.close();
	}

}

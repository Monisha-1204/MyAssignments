package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	public ChromeDriver driver;
	public String excelFileName;
	@Parameters({"url","username","password"})
@BeforeMethod
	public void preconditon(String url,String UName,String pwd) {
	// TODO Auto-generated method stub
	driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(UName);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
}
@AfterMethod
public void postcond() {
	// TODO Auto-generated method stub
driver.quit();
}
@DataProvider
public String[][] sendData() throws IOException {
	return ReadExcel.readExcel(excelFileName);
}
}
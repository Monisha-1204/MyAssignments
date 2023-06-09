package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	@BeforeTest
	public void setValues(){
		excelFileName = "CreateLead";
}
@Test(dataProvider="sendData")
	public void runCrear(String cname,String fname,String lname,String phno) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cname)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}

	}
	}

//	String[][] data=new String[2][4];
//	data[0][0]="Testleaf";
//	data[0][1]="Natesan";
//	data[0][2]="Nisha";
//	data[0][3]="99";
//	
//	data[1][0]="leaftest";
//	data[1][1]="nisha";
//	data[1][2]="moni";
//	data[1][3]="91";
//	
//	return data;
	// TODO Auto-generated method stub




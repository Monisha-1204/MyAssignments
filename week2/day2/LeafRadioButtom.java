package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafRadioButtom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
				// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
				
				driver.navigate().to("https://www.leafground.com/radio.xhtml");
				//Your most favorite browser
				driver.findElement(By.xpath("//h5[text()='Your most favorite browser']/following::label[text()='Edge']")).click();
				//UnSelectable
				driver.findElement(By.xpath("(//h5[text()='UnSelectable']/following::label)[3]")).click();

				//Find the default Radio button
				driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::label")).click();
				
				//Select the age group (only if not selected)
				
				System.out.println(driver.findElement(By.xpath("(//h5[text()='Select the age group (only if not selected)']/following::label)[2]")).isSelected());
			

	}

}

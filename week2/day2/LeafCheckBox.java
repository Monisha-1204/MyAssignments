package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafCheckBox {

public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				ChromeDriver driver = new ChromeDriver();
				
				driver.navigate().to("https://www.leafground.com/checkbox.xhtml");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Basic Checkbox
				driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/div[2]")).click();
						
				driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
				
				driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();

				driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
			
				//Tristates
				driver.findElement(By.xpath("//div[contains(@data-iconstates,'[\"\",\"ui-icon ui-icon-check')]")).click();
				Thread.sleep(2000);
			
				// isSelected is checked works fine
				
				boolean selected = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).isSelected();
				
				if(selected == true)
					System.out.println("check box is Enabled");
				else
					System.out.println("Check box is Disabled");
				
				//Select Multiple Checkbox Window
				
				driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
			
				//Miami - Grandparent to Grand child
				
				driver.findElement(By.xpath("(//li[@data-item-value='Miami']//div)[3]")).click();
			
				// Paris - Grandparent to Grandchild
				driver.findElement(By.xpath("(//li[@data-item-value='Paris']//div)[3]")).click();
				
				// Barcelona - - Grandparent to Grandchild
				driver.findElement(By.xpath("(//li[@data-item-value='Barcelona']//div)[3]")).click();
			
				//driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();				

			}

		}

	

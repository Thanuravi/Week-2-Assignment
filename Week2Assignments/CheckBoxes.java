package Week2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		Thread.sleep(2000);	
		
		WebElement v = driver.findElement(By.xpath("//span[text()='Ajax']"));
		
		if(v.isSelected())
		{
			System.out.println("Notification Checkbox is Checked...");
		}
		else
		{
			System.out.println("Notification Checkbox is Unchecked.....");
		}
		
				
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]")).click();
		
		
		WebElement b1 = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
		
		if (!b1.isEnabled())
		{
		System.out.println("Element is Disabled");
		}
		else
		{
			System.out.println("Element is Enabled");
		}
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Paris']")).click();	
		driver.findElement(By.xpath("//li[@data-item-value='Rome']")).click();
		
		driver.close();
	}

}

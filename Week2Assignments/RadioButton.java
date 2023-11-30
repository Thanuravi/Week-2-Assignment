package Week2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
		WebElement d = driver.findElement(By.xpath("(//label[(text()='Safari')])[2]"));
		String de = d.getText();
		System.out.println(d.getText());
		if(d.isEnabled())
		{
			System.out.println("Default Selected Radio Button is ... "+de);
		}	
	
		
		WebElement check = driver.findElement(By.xpath("//label[(text()='21-40 Years')]"));
		boolean b = check.isEnabled();
		System.out.println(b);
		if(b == false)
		{
			
			check.click();
		}
	
		//driver.close();
	

	}

}

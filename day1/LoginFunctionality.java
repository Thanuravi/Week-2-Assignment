package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver =new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		//to locate the username element -> ctrl 2 l
		//WebElement username = driver.findElement(By.id("username"));		
		//username.sendKeys("DemoCSR");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		//totype inthe text field use sendKeys()
		
		//to loacte the password 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//to click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on the link CRMSFA
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		System.out.println(crmsfa.getText());//Element verification
		crmsfa.click();
		//to get the titleof the page
		String title = driver.getTitle();//Browser verification
		System.out.println(title);		
		
		driver.findElement(By.id("ext-gen820")).click();
		
		driver.close();

	}

}

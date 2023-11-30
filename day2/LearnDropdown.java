package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		System.out.println(crmsfa.getText());// Element verification
		crmsfa.click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Stdu");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thanushree");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("PR");

		// to handle drop down -- select tag
		// step:1 locate the drop doen ele
		// step:2 use select class by creating a object and pass argument as webelement

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));

		Select dd = new Select(source);
		dd.selectByIndex(4);// using index

		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));

		Select mark = new Select(marketing);
		mark.selectByValue("CATRQ_AUTOMOBILE"); // the value attribute
		mark.selectByVisibleText("Automobile");// using black text
		WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select indu = new Select(Industry);
		indu.selectByVisibleText("Real Estate"); 
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select Owner = new Select(Ownership);
		Owner.selectByVisibleText("Corporation");
		
		
	}

}

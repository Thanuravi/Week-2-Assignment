package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();				
		EdgeDriver driver1=new EdgeDriver();						
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();			
		driver.close();
		driver1.close();
	}

}

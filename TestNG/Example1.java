package Examples;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example1 {
	//webDriver declartaion
	WebDriver driver;
	WebDriverWait wait;

		@BeforeClass
		 public void setUp() {
           driver=new  FirefoxDriver();
           wait=new WebDriverWait(driver,Duration.ofSeconds(10));
           driver.get("https://training-support.net");
		 
		 
		}
		
	@Test(priority=1)
	public void verifyPageTitle() {
	assertEquals(driver.getTitle(),"Training Support");
}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}

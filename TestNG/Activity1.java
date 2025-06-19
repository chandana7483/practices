package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	
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
	@Test(priority=2)
		public void verifyAboutPage() {
			driver.findElement(By.linkText("About Us")).click();
			wait.until(ExpectedConditions.titleContains("About"));
			assertEquals(driver.getTitle(),"About Training Support");
		}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

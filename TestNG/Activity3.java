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

public class Activity3 {
	
	WebDriver driver;
	WebDriverWait wait;

		@BeforeClass
		 public void setUp() {
           driver=new  FirefoxDriver();
           wait=new WebDriverWait(driver,Duration.ofSeconds(10));
           driver.get("https://training-support.net/webelements/login-form");
		 
		 
		}
		
	@Test(priority=1)
	public void verifyPageTitle() {
	assertEquals(driver.getTitle(),"Selenium: login Form");
	
	
}
	@Test(priority=2)
	public void loginFailTest() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("pass");
		String message=driver.findElement(By.id("subheading")).getText();
		assertEquals(message,"Invalid credentials");
		
	}
	@Test(priority=3)
	public void logPassTest() {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.text-emerald-500"))).getText();
		assertEquals(message,"Login Sucess!");
		
		 
		
	
	}
	
	
	
	
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}

}

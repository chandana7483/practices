package Activities;


	import static org.testng.Assert.assertEquals;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class Activity2 {
		
		WebDriver driver;
		WebDriverWait wait;

			@BeforeClass
			 public void setUp() {
	           driver=new  FirefoxDriver();
	           wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	           driver.get("https://training-support.net/webelements/target-practice");
			 
			 
			}
			
		@Test(priority=1)
		public void verifyPageTitle() {
			
		assertEquals(driver.getTitle(),"Selenium: Target Practice");
	}
		@Test(priority=2)
			public void varifyButtonText() {
				String buttonText=driver.findElement(By.cssSelector("button.bg-slate-200")).getText();
				assertEquals(buttonText,"Black");
			}
		@Test(priority=3,enabled=false)
			public void verifyHeadingText() {
			String headingText=driver.findElement(By.tagName("h1")).getText();
			assertEquals(headingText,"Heading #1");
			
		}
		@Test(priority=4)
		public void verifyFooterText() {
			throw new SkipException("This test will be skipped");
		}	
		
		
		
		@AfterClass
		public void tearDown() {
			driver.quit();
		}

	}




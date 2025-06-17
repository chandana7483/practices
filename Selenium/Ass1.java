package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass1 {
		public static void main(String[] args) {
			 WebDriver driver=new EdgeDriver();
			 
	   driver.get("https://google.com");
	
	   
	   //sendkeys() 
	   
	   driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
	   
	   
	   /* Actions actionprovider=new Actions(driver);
	   Actions keydown=actionprovider.keyDown(Keys.CONTROL).sendKeys("a").build();
	   keydown.perform();*/
	   
	   System.out.println(driver.getTitle());
	     //driver.close();
	   
		}

	


	}



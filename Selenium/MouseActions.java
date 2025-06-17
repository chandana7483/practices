package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new EdgeDriver();
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.manage().window().maximize();
   driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
   WebElement boxA=driver.findElement(By.xpath("//li[text()='A']"));
   WebElement boxD=driver.findElement(By.xpath("//li[text()='D']"));
   
   Actions action=new Actions(driver);
 //  action.moveToElement(boxA);
   action.clickAndHold();
 //  action.moveToElement(boxD);
  // action.contextClick(boxD);
  // action.doubleClick(boxD);
   
   /*driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
   WebElement ele1=driver.findElement(By.xpath("//li[text()='A']"));
   WebElement ele2=driver.findElement(By.xpath("//li[text()='D']"));
   
   Actions action=new Actions(driver);
   action.dragAndDrop(ele1,ele2);
   action.build().perform();*/
   // Thread.sleep(2000);
    //driver.quit();
    System.out.println("Done");
 

		   
   
   
  
   
	}

}

package scenario1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoibiboApp {
  @Test
  public void testDropdown()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.goibibo.com/");
	 //close
	  driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
	  
	  driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
	  
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
	  
	  List<WebElement> list=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']"));
	  
	  
	  
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  
  }
}

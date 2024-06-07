package webtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_Assignment {
  @Test
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.google.com");
	  
	  for(int i=1;i<=10;i++)
	  {
	  WebDriver driver2=driver.switchTo().newWindow(WindowType.WINDOW);
	  driver2.get("https://www.facebook.com");
	  }
	  
	  
	  
  }
}

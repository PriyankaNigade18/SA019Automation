package zohotest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZohoSignUp {
  @Test
  public void signupTest() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.zoho.com/");
	  
	  //sign up
	  driver.findElement(By.linkText("Sign up")).click();
	  
	  //check signup
	  driver.findElement(By.id("email")).sendKeys("testselenium@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("testingselenium");
	  driver.findElement(By.id("rmobile")).sendKeys("9552671595");
	  driver.findElement(By.id("signup-termservice")).click();
	  driver.findElement(By.id("signupbtn")).click();
	  
	  
	  
	  
	  
	  
  }
}

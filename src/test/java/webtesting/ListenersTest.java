package webtesting;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersTest {
  @Test(priority=1)
  public void testCase1()
  {
	  System.out.println("This is test1");
	  Assert.assertEquals(true,true,"Test fail: as condition not matched!");
	  System.out.println("Test Pass: as condition is matched!");
  }
  
  
  @Test(priority=2)
  public void testCase2()
  {
	  System.out.println("This is test2");
	  Assert.assertEquals(true,false,"Test fail: as condition not matched!");
	  System.out.println("Test Pass: as condition is matched!");
  }
  
  
  
}

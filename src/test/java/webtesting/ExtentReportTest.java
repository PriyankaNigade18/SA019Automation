package webtesting;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportTest {
  @Test
  public void testReport() 
  {
	  //create instance for ExtentReports claSS
	  
	  ExtentReports extent=new ExtentReports();
	  
	  //path of report
	  ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//AutomationTest.html");
	  
	  //setup
	  spark.config().setDocumentTitle("This is Extent Report for Automation Test");
	  spark.config().setReportName("Sprint 1 Test Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attached report 
	  extent.attachReporter(spark);
	  
	  //create a test	
	 ExtentTest test= extent.createTest("AutomatinTestReport");
	  
	 //log
	 test.log(Status.PASS, "Test Pass!");
	 test.log(Status.FAIL, "Test Fail!");
	 test.log(Status.SKIP, "Test Skipped!");
	  
	  //flush()
	 extent.flush();
  }
}

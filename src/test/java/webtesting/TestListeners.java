package webtesting;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener
{
	
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Pass TestCase: "+result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Fail TestCase: "+result.getName());
	}

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Skipped TestCase: "+result.getName());
	}
}

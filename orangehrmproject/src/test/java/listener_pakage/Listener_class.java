package listener_pakage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import commonfunction.Initialization_class;

public class Listener_class extends Initialization_class implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) {
	    System.out.println("the test case has been successfully started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("the test case has been successfully passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	    try {
	    	TakesScreenshot screenshot=(TakesScreenshot)driver;
			File source= screenshot.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\krgpo\\Pictures\\dashboard.png");
			FileUtils.copyFile(source, destination);
			System.out.println("screen shot taken");
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("the test case has been skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("the test case has been passed with success percentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("the browser has been launched");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("the browser has been closed");
		
	}

}

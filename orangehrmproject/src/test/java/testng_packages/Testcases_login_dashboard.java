package testng_packages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonfunction.Initialization_class;
import pom_pageobjects.Dashboard_page_objects;



public class Testcases_login_dashboard extends Initialization_class
{
	public static Logger logger=Logger.getLogger(Testcases_login_dashboard.class);
	@Test
	 public void pendingleave() throws IOException 
	 {
		test=reports.createTest("dash board");
		PageFactory.initElements(driver,pom_pageobjects.Dashboard_page_objects.class);
		test.log(Status.INFO, "verifing the leave request");
		String leavedetails=Dashboard_page_objects.leaverequest.getText();
		Assert.assertEquals(leavedetails, " arati#@$5 ffgg675@#4 2022-09-01");
		System.out.println("*******"+leavedetails+"*******");
//		logger.info("pass");
//		if(leavedetails.equals("No Records")) 
//		{
//			Assert.assertEquals(leavedetails, "No Records are Available");
//			logger.info("pass");
//		}
//		else 
//		{
//			TakesScreenshot ss=(TakesScreenshot) driver;
//			File source= ss.getScreenshotAs(OutputType.FILE);
//			File destination=new File("C:\\Users\\krgpo\\Pictures\\dashboard.png");
//			FileUtils.copyFile(source, destination);
//			logger.info("failed");
//			logger.info("screenshot taken");
//		}
	 }
}
